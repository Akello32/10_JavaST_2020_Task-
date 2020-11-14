package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class Text extends BaseText {
    /** Contains paragraphs. */
    private final List<Paragraph> paragraphList = new ArrayList<>();

    public Text(final String value) {
        super(value);
    }

    /**
     * Adds paragraph in the list.
     * @param paragraph - paragraph to add
     */
    public void addParagraph (final Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public List<Paragraph> getParagraphList() {
        return paragraphList;
    }
}
