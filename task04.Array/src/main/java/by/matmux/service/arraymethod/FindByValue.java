package by.matmux.service.arraymethod;

public class FindByValue {
    public int indexOf(final int[] arr, final int x) {
        if (arr == null) {
            return -1;
        }

        if (arr.length == 0) { return 0; }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){ return arr[i]; }
        }
        return -1;
    }
}
