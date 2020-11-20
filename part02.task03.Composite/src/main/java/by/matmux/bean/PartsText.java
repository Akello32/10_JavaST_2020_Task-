package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class PartsText implements TextComposite {
    /** Contains type of part of text. */
    private TextType type;
    /** Contains value of part text. */
    private String value;

    private int position;

    /** Contains parts of text. */
    private final List<TextComposite> parts = new ArrayList<>();

    public PartsText(final String value, final TextType type, final int position) {
        this.type = type;
        this.value = value;
        this.position = position;
    }

    @Override
    public List<TextComposite> getParts() {
        return parts;
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (TextComposite p : parts) {
            for (TextComposite t : p.getParts()) {
                if (t == null) {
                    sb.append(p.toString() + " ").toString();
                    continue;
                }
                sb.append(t.getValue());
            }
        }
        return sb.toString();
    }
    /**
     * Adds parts of text in the list.
     * @param text - part to add
     */
    @Override
    public void addText(TextComposite text) {
        parts.add(text);
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return value;
    }
}
