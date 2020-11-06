package by.matmux.beans;

public class MatrixMember {
    /** Stores the value of a matrix cell. */
    private int value;

    /** Stores the state of the cell: changed, unchanged */
    private boolean state;

    public MatrixMember() {
        this.state = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
