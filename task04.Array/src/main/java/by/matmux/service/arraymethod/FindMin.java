package by.matmux.service.arraymethod;

public class FindMin {
    public int min(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int min = arr[0];
        for (int x : arr) { if (x < min) { min = x; } }
        return min;
    }
}
