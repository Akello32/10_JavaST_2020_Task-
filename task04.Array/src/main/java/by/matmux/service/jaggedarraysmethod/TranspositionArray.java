package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;

public class TranspositionArray {
    public JaggedArray transposition(JaggedArray array) {
        CheckSquare checkSquare = new CheckSquare();
        JaggedArray tmpArr;
        if (array == null || array.getJagArr() == null) {
            return array;
        }

        for (int i = 0; i < array.length() - 1; i++) {
            int tmp = array.getRow(i).length;
            if (tmp != array.getRow(i + 1).length) { return array; }
        }

        if (checkSquare.isSquare(array)) {
            int tmp = 0;
            for (int i = 0; i < array.length(); i++) {
                for (int j = 0; j < array.getRow(i).length; j++) {
                    tmp = array.getRow(i)[j];
                    array.getRow(i)[j] = array.getRow(j)[i];
                    array.getRow(j)[i] = tmp;
                }
                return array;
            }
        } else {
            tmpArr = new JaggedArray(array.getRow(0).length, array.length());
            for (int i = 0; i < array.length(); i++) {
                for (int j = 0; j < array.getRow(i).length; j++) {
                    tmpArr.getRow(j)[i] = array.getRow(i)[j];
                }
            }
            return tmpArr;
        }
        return null;
    }
}

