package by.matmux.service.third_solution;

import by.matmux.beans.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ControllerThread extends Thread {
    /** Stores the threads of third solution */
    private List<ThirdFillingThread> list;

    /** Logger. */
    private static final Logger log = LogManager.getLogger(ControllerThread.class);

    private final Matrix matrix = Matrix.getInstance();

    public ControllerThread(final List<ThirdFillingThread> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (ThirdFillingThread th : list) {
            int first = th.getPosition();
            int numberCells = th.getNumberCells();
            int[] arr = new int[first + numberCells];
            for (int i : arr) {
                if (matrix.getMatrix()[i][i].isState()) {
                    th.getCountDown().countDown();
                } else {
                    log.debug(() ->"Blank field in " + th);
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
