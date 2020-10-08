package by.matmux.service.jaggedarraysmethod;

import by.matmux.bean.JaggedArray;

public class CheckSquare {
    /**
     * checking it matrix square
     * @param jagArr
     * @return
     */
    public boolean isSquare(JaggedArray jagArr) {
        for (int i = 0; i < jagArr.length(); i++) {
            if (jagArr.getRow(i).length != jagArr.length()) { return false; }
        }
        return true;
    }
}
