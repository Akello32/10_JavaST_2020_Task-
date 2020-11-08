package by.matmux.service;

import by.matmux.beans.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckMatrix implements Runnable {
    private final Matrix matrix = Matrix.getInstance();

    private static final Logger log = LogManager.getLogger(CheckMatrix.class);

    @Override
    public void run() {
        for (int i = 0; i < matrix.length(); i++) {
            if (!matrix.getMatrix()[i][i].isState()) {
                log.debug(() -> "The thread worked with errors");
            } else {
                log.debug(() -> "The thread worked without errors");
            }
        }
    }
}
