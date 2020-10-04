package by.matmux.service.arrayMethod;

import by.matmux.bean.Array;

import java.util.ArrayList;

public class FibonachiNumbers {
    public ArrayList find(final Array arr) {
        ArrayList<Integer> fibList = new ArrayList<>();

        for (int i = 2; i < arr.length(); i++) {
            if (arr.get(i) == arr.get(i-1) + arr.get(i-2)) { fibList.add(arr.get(i)); }
        }

        return fibList;
    }
}
