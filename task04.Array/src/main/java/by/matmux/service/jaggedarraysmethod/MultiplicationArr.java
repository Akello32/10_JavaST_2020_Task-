package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;

public class MultiplicationArr {
    /**
     * multiplying an array by a number
     * @param array
     * @param coeff
     */
    public String multiplication(JaggedArray array, int coeff) {
        if (array == null || array.getJagArr() == null) {
            return "Your array is null ";
        }

        for (int i = 0; i < array.length(); i++) {
            for (int j = 0; j < array.getRow(i).length; j++) {
                array.getRow(i)[j] *= coeff;
            }
        }
        return "Successful addition!";
    }
}
