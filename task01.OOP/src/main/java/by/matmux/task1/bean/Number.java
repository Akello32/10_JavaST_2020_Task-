package by.matmux.task1.bean;

public class Number {
    /** Save object condition. */
    private int value;
    // TODO перебросить check в Runner
    private boolean check;

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public boolean getCheck() {
        return check;
    }

    public void setCheck(final boolean check) {
        this.check = check;
    }
}
