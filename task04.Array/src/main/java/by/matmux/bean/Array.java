package by.matmux.bean;

import java.util.Arrays;

public class Array {
    private int[] arr;

    public Array(final int[] arr) {
        this.arr = arr;
    }

    public Array(final int length) {
        if (length < 1) {
            arr = new int[1];
        }
        arr = new int[length];
    }

    public Array() {}

    public int get(final int i) { return arr[i]; }

    public void set(final int i, final int value) { arr[i] = value; }

    public int[] getArr() {
        return arr;
    }

    public int length() { return arr.length; }

    public void setArrFromFiles() {
    }

    public void setArrFromConsole() {
    }

    public void setArrFromRandom() {

    }

    public int findByValue(final int x) {
        return x;
    }

    public int findMax() {
        return -1;
    }

    public void shuttleSort() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(getArr(), array.getArr());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArr());
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}


