package by.matmux.bean;

public abstract class BaseText {
    private String value;

    public BaseText(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
