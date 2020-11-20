package by.matmux.service.query;

import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;

import java.util.Collections;
import java.util.Comparator;

public class SortParagraphQuery implements Query {
    /**
     * Sorts paragraphs by the number of sentences.
     * @param text - text to sort
     * @return the result of sorting
     */
    @Override
    public String sort(final String text) {
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH, TextType.SENTENCE));

        TextComposite partsText = parser.parser(text);

        Comparator<TextComposite> comparator = Comparator.comparing(p -> p.getParts().size());
        partsText.getParts().sort(comparator);
        Collections.reverse(partsText.getParts());

        StringBuilder sb = new StringBuilder();
        partsText.getParts().forEach(s -> sb.append(s.toString()).append("\n"));

        return sb.toString();
    }
}
