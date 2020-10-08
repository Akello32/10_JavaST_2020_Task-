package by.matmux.service.arraymethod;

import by.matmux.bean.Array;

import java.util.ArrayList;

public class FindPrimeNumber {
    /**
     * finding all prime numbers in the array
     * @param arr
     * @return ArrayList with prime numbers
     */
    public ArrayList<Integer> getPrimeNumber(final Array arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int isPrime = 2;

        if (arr == null || arr.getArr() == null) {
            return result;
        }

        for (int i = 0; i < arr.length(); i++) {
            for (int j = 2; j < arr.get(i); j++) {
                if (arr.get(i)%j == 0) { isPrime++; }
            }
            if (isPrime == 2) { result.add(arr.get(i)); }
            isPrime = 2;
        }

        return result;
    }
}
