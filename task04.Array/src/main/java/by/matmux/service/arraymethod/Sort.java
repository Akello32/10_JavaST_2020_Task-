package by.matmux.service.arraymethod;

import by.matmux.bean.Array;

public class Sort {
    public String shuttleSort(final Array arr) {
        for (int i = 1; i < arr.length(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                swap(arr, i, i - 1);

                for (int z = i - 1; z - 1 >= 0; z--) {
                    if (arr.get(z) < arr.get(z - 1)) {
                        swap(arr, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return "Your array is sorted by shuttle sort";
    }

    public String quickSort(final Array arr, final int leftBorder, final int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int pivot = arr.get((left + right) / 2);

        do {
            while (arr.get(left) < pivot) {
                left++;
            }
            while (arr.get(right) > pivot) {
                right--;
            }

            if (left <= right) {
                if (left < right) { swap(arr, left, right); }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < rightBorder) {
            quickSort(arr, left, rightBorder);
        }
        if (leftBorder < right) {
            quickSort(arr, leftBorder, right);
        }
        return "Your array is sorted by quick sort";
    }

    public String shellSort(final Array arr) {
        int gap = arr.length() / 2;

        while (gap >= 1) {
            for (int i = 0; i < arr.length(); i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr.get(j) > arr.get(j + gap)) {
                        swap(arr, j, j + gap);
                    }
                }
            }
            gap /= 2;
        }
        return "Your array is sorted by shell sort";
    }

    private void swap(final Array array, final int ind1, final int ind2) {
        int tmp = array.get(ind1);
        array.set(ind1, array.get(ind2));
        array.set(ind2, tmp);
    }
}
