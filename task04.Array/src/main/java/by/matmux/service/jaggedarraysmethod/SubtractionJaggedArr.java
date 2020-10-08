package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;
public class SubtractionJaggedArr {
    /**
     * subtracting another array to an array
     * @param arr1
     * @param arr2
     */
    public String subtraction(JaggedArray arr1, JaggedArray arr2) {
        if (!(arr1.equals(arr2))) { return "Your arrays are not the same size"; }
        else {
            for (int i = 0; i < arr1.length(); i++) {
                for (int j = 0; j < arr1.getRow(i).length; j++) {
                    arr1.getRow(i)[j] -= arr2.getRow(i)[j];
                }
            }
        }
        return "Successful subtraction";
    }
}
