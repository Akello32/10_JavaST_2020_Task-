package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;

public class AdditionJaggedArr {
    /**
     * adding another array to an array
     * @param arr1
     * @param arr2
     */
    public String addition(JaggedArray arr1, JaggedArray arr2) {
        if (!(arr1.equals(arr2))) { return "Your arrays are not the same size"; }

        if (arr1 == null || arr2 == null) {
            return "Your arr a is null";
        } else {
            for (int i = 0; i < arr1.length(); i++) {
                for (int j = 0; j < arr1.getRow(i).length; j++) {
                    arr1.getRow(i)[j] += arr2.getRow(i)[j];
                }
            }
        }
        return "Successful addition!";
    }
}
