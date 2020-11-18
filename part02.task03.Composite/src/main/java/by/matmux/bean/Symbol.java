package by.matmux.bean;

import java.util.Collections;
import java.util.List;

public class Symbol implements TextAction{
    private final char value;

    public Symbol(char value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public List<PartsText> getParts() {
        return Collections.singletonList(new PartsText(String.valueOf(value), TextType.WORD));
    }
}
