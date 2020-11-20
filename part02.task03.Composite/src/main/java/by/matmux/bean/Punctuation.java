package by.matmux.bean;

import java.util.Collections;
import java.util.List;

public class Punctuation implements TextComposite {
    private final char punct;
    private final int position;

    public Punctuation(final char punct, final int position) {
        this.punct = punct;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String getValue() {
        return String.valueOf(punct);
    }

    @Override
    public void addText(TextComposite text) {

    }

    @Override
    public List<TextComposite> getParts() {
        return Collections.singletonList(this);
    }
}
