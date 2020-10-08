package by.matmux.service.arraymethod;

import java.util.Random;

public class SetArrFormRandom {
    /** set array from random
     * @param arr
     * @return message of result
     */
    public String set(final int[] arr) {
        if (arr == null) {
            return "Your array is empty!";
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return "Your array is full";
    }
}
