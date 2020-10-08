package by.matmux.service.arraymethod;

import by.matmux.bean.Array;

import java.util.ArrayList;

public class FindThreeDigit {
    /**
     * finds all three digit numbers that don't have the same digits
     * @param arr
     * @return
     */
    public ArrayList<Integer> find(Array arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            if (arr.get(i) < 100 || arr.get(i) > 999) {
                result.add(-1);
                return result;
            } else if (arr.get(i) % 10 != (arr.get(i)/10)%10
                        && arr.get(i)/100 != arr.get(i) % 10
                        && (arr.get(i)/10)%10 != arr.get(i)/100) { result.add(arr.get(i)); }
            }
        return result;
    }
}
