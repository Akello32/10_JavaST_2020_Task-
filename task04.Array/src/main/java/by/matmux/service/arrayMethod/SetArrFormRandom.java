package by.matmux.service.arrayMethod;

import java.util.Random;

public class SetArrFormRandom {
    /** set array from random
     * @param arr
     */
    public void set(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
    }
}
