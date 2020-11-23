package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class PartsText implements TextComposite {
    /** Contains type of part of text. */
    private TextType type;
    /** Contains value of part text. */
    private String value;

    /** Contains parts of text. */
    private final List<TextComposite> parts = new ArrayList<>();

    public PartsText(final String value, final TextType type) {
        this.type = type;
        this.value = value;
    }

    @Override
    public List<TextComposite> getParts() {
        return parts;
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (TextComposite p : parts) {
            sb.append(type.getSeparator());
            for (TextComposite t : p.getParts()) {
                if (t.getParts().isEmpty()) {
                    sb.append(t.toString()).toString();
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
    public String toString() {
        return value;
    }
}
