package by.matmux.service.arrayMethod;

public class BinarySearch {
    /**
     * finds the specified element in the sorted array
     * @param arr
     * @param num
     * @return index of element
     */
    public int binarySearch(final int[] arr, final int num) {
        int left = 0;
        int right = arr.length;
        int mid = 0;

        while (!(left >= right)) {
            mid = left + (right - left);

            if (mid == num) {
                return mid;
            }

            if (arr[mid] > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
