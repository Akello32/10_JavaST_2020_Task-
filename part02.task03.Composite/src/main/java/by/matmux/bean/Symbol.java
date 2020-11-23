package by.matmux.bean;

import java.util.Collections;
import java.util.List;

public class Symbol implements TextComposite {
    private final char value;

    public Symbol(char value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public void addText(TextComposite text) {

    }

    @Override
    public List<TextComposite> getParts() {
        return Collections.singletonList(this);
    }
}
