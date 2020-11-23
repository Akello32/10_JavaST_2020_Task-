package by.matmux.service.query;

import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.dao.TextRepository;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;

import java.util.Comparator;

public class SortParagraphQuery implements Query {
    /**
     * Sorts paragraphs by the number of sentences.
     * @param text - text to sort
     * @return the result of sorting
     */
    @Override
    public String sort() {
        TextComposite text = TextRepository.getComposite();
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH, TextType.SENTENCE));

        parser.parser(text.toString(), text);

        Comparator<TextComposite> comparator = Comparator.comparing(p -> p.getParts().size());
        text.getParts().sort(comparator);

        return text.getValue();
    }
}
