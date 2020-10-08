package by.matmux.service.arraymethod;

import by.matmux.bean.Array;

public class BinarySearch {
    /**
     * finds the specified element in the sorted array
     * @param arr
     * @param num
     * @return index of element
     */
    public int binarySearch(final Array arr, final int num) {
        int left = 0;
        int right = arr.length();
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left);

            if (mid == num) {
                return mid;
            }

            if (arr.get(mid) > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
