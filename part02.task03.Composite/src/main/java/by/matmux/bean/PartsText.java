package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class PartsText implements TextAction {
    /** Contains type of part of text. */
    private TextType type;
    /** Contains value of part text. */
    private String value;

    /** Contains parts of text. */
    private final List<PartsText> parts = new ArrayList<>();

    public PartsText(final String value, final TextType type) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public List<PartsText> getParts() {
        return parts;
    }

    /**
     * Adds parts of text in the list.
     * @param part - part to add
     */
    public void add(final PartsText part) {
        parts.add(part);
    }
    /**
     * Returns part by the index.
     * @param i - index
     * @return part
     */
    public TextAction get(final int i) {
        return parts.get(i);
    }

    /**
     * Returns regular expression.
     * @return String regexp
     */
    public String getRegexp() {
        return type.getRegexp();
    }

    /**
     * Returns type of part of text.
     * @return TextType type.
     */
    public TextType getType() {
        return type;
    }

    @Override
    public String toString() {
        return value;
    }
}
