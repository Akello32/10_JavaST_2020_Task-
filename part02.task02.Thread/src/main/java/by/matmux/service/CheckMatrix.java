package by.matmux.service;

import by.matmux.beans.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckMatrix implements Runnable {
    /** Matrix. **/
    private final Matrix matrix = Matrix.getInstance();

    /** Logger. **/
    private static final Logger log = LogManager.getLogger(CheckMatrix.class);

    /**
     * Checks the matrix after filling it with one of the solutions
     */
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
