package by.matmux.service.query;

import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.dao.TextRepository;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;

import java.util.Comparator;

public class SortWordQuery implements Query {
    @Override
    public String sort() {
        TextComposite text = TextRepository.getComposite();
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH, TextType.SENTENCE)).
                linkWith(new SpecificParser(TextType.SENTENCE, TextType.LEXEME)).
                linkWith(new SpecificParser(TextType.LEXEME, TextType.WORD));

        parser.parser(text.toString() ,text);
        Comparator<TextComposite> comparator = Comparator.comparing(s -> s.toString().length());
        for (TextComposite p : text.getParts()) {
            for (TextComposite s : p.getParts()) {
                s.getParts().sort(comparator);
            }
        }
        return text.getValue();
    }
}

