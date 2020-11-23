package by.matmux.service.query;

import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.dao.TextRepository;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortLexemeQuery implements Query{
    List<Integer> listCount = new ArrayList<>();

    @Override
    public String sort() {
        TextComposite text = TextRepository.getComposite();
        char n = 'e';
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH ,TextType.SENTENCE)).
                linkWith(new SpecificParser(TextType.SENTENCE, TextType.LEXEME)).
                linkWith(new SpecificParser(TextType.LEXEME, TextType.WORD));

        parser.parser(text.toString(), text);

        Comparator<TextComposite> comparator = Comparator.comparing(TextComposite::toString);
        for (TextComposite a : text.getParts()) {
            for (TextComposite b : a.getParts()) {
                b.getParts().sort(comparator);
                for (TextComposite c : b.getParts()) {
                    listCount.add(StringUtils.countMatches(c.toString(), String.valueOf(n)));
                }
            }
        }

        for (TextComposite a : text.getParts()) {
            for (TextComposite b : a.getParts()) {
                for (int i = b.getParts().size() - 1; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        if (listCount.get(j) < listCount.get(j + 1)) {
                            toSwap(j, j+1);
                            toSwapComposite(j, j+1, b);
                        }
                    }
                }
            }
        }
        return text.getValue();
    }

    private void toSwap(final int in1, final int in2) {
        int temp = listCount.get(in1);
        listCount.set(in1, listCount.get(in2));
        listCount.set(in2, temp);
    }

    private void toSwapComposite(final int in1, final int in2, TextComposite composite) {
        TextComposite t = composite.getParts().get(in1);
        composite.getParts().set(in1, composite.getParts().get(in2));
        composite.getParts().set(in2, t);
    }
}