package by.matmux.service.query;

import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;

import java.util.Comparator;

public class SortWordQuery implements Query {
    @Override
    public String sort(String text) {
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH ,TextType.SENTENCE)).
                linkWith(new SpecificParser(TextType.SENTENCE, TextType.LEXEME)).
                linkWith(new SpecificParser(TextType.LEXEME, TextType.WORD));

        TextComposite partsText = parser.parser(text);
        Comparator<TextComposite> comparator = Comparator.comparing(s -> s.toString().length());
        for (TextComposite p : partsText.getParts()) {
            for (TextComposite s : p.getParts()) {
                for (TextComposite t : s.getParts())
                t.getParts().sort(comparator);
            }
        }

        return partsText.getValue();
    }
}

