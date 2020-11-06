package by.matmux.service;

import by.matmux.beans.Matrix;

public class CheckMatrix implements Runnable {
    private final Matrix matrix = Matrix.getInstance();

    @Override
    public void run() {
        for (int i = 0; i < matrix.length(); i++) {
            if (!matrix.getMatrix()[i][i].isState()) {

            }
        }
    }
}
