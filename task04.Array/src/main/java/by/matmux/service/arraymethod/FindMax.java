package by.matmux.service.arraymethod;

public class FindMax {
    /**
     * finds the maximum number in the array
     * @param arr
     * @return maximum number
     */
    public int max(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        for (int x : arr) { if (x > max) { max = x; } }
        return max;
    }
}
