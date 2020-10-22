package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;

import java.util.Arrays;
import java.util.Collections;

public class SortJaggedArray {
    /**
     * creating array on sum of matrix's row
     * @param array
     * @param decrease
     * @return message of result
     */
    public String sumOfElemRow(JaggedArray array, boolean decrease) {
        int[] sum = new int[array.length()];
        for (int i = 0; i < array.length(); i++) {
            for (int j = 0; j < array.getRow(i).length; j++) {
                sum[i] += array.getRow(i)[j];
            }
        }
        return sortJagged(array, sum, decrease);
    }

    /**
     * creating an array from the maximum elements of a matrix row
     * @param array
     * @param decrease
     * @return message of result
     */
    public String maxElemRow(JaggedArray array, boolean decrease) {
        int[] maxArr = new int[array.length()];
        for (int i = 0; i < array.length(); i++) {
            int max = array.getRow(i)[0];
            for (int j : array.getRow(i)) {
                if (j > max) { max = j; }
            }
            maxArr[i] = max;
        }
        sortJagged(array, maxArr, decrease);
        return sortJagged(array, maxArr, decrease);
    }

    /**
     * creating an array from the minimum elements of a matrix row
     * @param array
     * @param decrease
     * @return message of result
     */
    public String minElemRow(JaggedArray array, boolean decrease) {
        int[] minArr = new int[array.length()];
        for (int i = 0; i < array.length(); i++) {
            int min = array.getRow(0)[0];
            for (int j : array.getRow(i)) {
                if (j < min) { min = j; }
            }
            minArr[i] = min;
        }

        return sortJagged(array, minArr, decrease);
    }

    /**
     * sorts jaggedArray by the passed array in descending or ascending order
     * @param array
     * @param arrTmp
     * @param decrease
     * @return message of result
     */
    private String sortJagged(JaggedArray array, int[] arrTmp, boolean decrease) {
            for (int i = array.length() - 1; i >= 1; i--) {
                for (int j  = 0; j < i; j++) {
                    if (arrTmp[j] > arrTmp[j + 1]) {
                        swap(arrTmp, j, j+1 );
                        swapArr(array, j, j + 1);
                    }
                }
            }
            if (decrease) {
                Collections.reverse(Arrays.asList(array.getJagArr()));
            }
        return "Array is sorted";
    }

    /**
     * swap two element's of array
     * @param array
     * @param ind1
     * @param ind2
     */
    private void swap(final int[] array, final int ind1, final int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    /**
     * swap two row's of jaggedArray
     * @param jaggedArray
     * @param ind1
     * @param ind2
     */
    private void swapArr(final JaggedArray jaggedArray, final int ind1, final int ind2) {
        int[] tmp = jaggedArray.getRow(ind1);
        jaggedArray.setRow(ind1, jaggedArray.getRow(ind2));
        jaggedArray.setRow(ind2, tmp);
    }
}
