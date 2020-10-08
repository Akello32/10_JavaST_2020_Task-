package by.matmux.bean;

import java.util.Arrays;

public class JaggedArray {
    private int[][] jagArr;

    public JaggedArray(final int[][] arr) {
        this.jagArr = arr;
    }

    public JaggedArray(final JaggedArray array) { this.jagArr = array.getJagArr(); }

    public JaggedArray(final int row, final int col) { this.jagArr = new int[row][col]; }

    public int[][] getJagArr() {
        return jagArr;
    }

    public int length() {
        return jagArr.length;
    }

    public void setRow(int i, int[] arr) {
        jagArr[i] = arr;
    }

    public int[] getRow(final int x) { return jagArr[x]; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray that = (JaggedArray) o;
        if (jagArr.length != that.length()) {
            return false;
        } else {
            for (int i = 0; i < jagArr.length; i++) {
                if (jagArr[i].length != that.getRow(i).length) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getJagArr());
    }

    @Override
    public String toString() {
        return "JaggedArray{" +
                Arrays.deepToString(jagArr) +
                '}';
    }
}
