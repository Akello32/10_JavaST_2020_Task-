package by.matmux.bean;

import by.matmux.service.arraymethod.ArrayMethodFactory;

import java.util.Arrays;

public class Array {
    private int[] arr;
    ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();

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
        arrayMethodFactory.getSetArrFromFiles().set(arr);
    }

    public void setArrFromRandom() {
        arrayMethodFactory.getSetArrFormRandom().set(arr);
    }

    public int findByValue(final int x) {
        return arrayMethodFactory.getFindByValue().indexOf(arr, x);
    }

    public int findMax() {
        return arrayMethodFactory.getFindMax().max(arr);
    }

    public int findMin() {
        return arrayMethodFactory.getFindMin().min(arr);
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
        if (arr == null) {
            return "null";
        } else {
            int iMax = arr.length - 1;
            if (iMax == -1) {
                return "[]";
            } else {
                StringBuilder b = new StringBuilder();
                b.append("Array[");
                int i = 0;

                while(true) {
                    b.append(arr[i]);
                    if (i == iMax) {
                        return b.append(']').toString();
                    }

                    b.append(", ");
                    ++i;
                }
            }
        }
    }
}


