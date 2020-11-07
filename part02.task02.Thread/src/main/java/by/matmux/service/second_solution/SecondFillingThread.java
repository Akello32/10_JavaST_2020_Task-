package by.matmux.service.second_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.ShowMatrix;
import by.matmux.service.first_solution.FirstFillingThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SecondFillingThread implements Runnable {
    /**
     * Logger.
     */
    private static final Logger log = LogManager.getLogger(FirstFillingThread.class);
    /**
     * Semaphore.
     */
    private Semaphore sem;

    /**
     * Thread number counter.
     */
    private static int uniqueNumber = 9;

    /**
     * Thread id.
     */
    private int id;

    /**
     * Matrix.
     */
    private final Matrix matrix = Matrix.getInstance();

    /**
     * Object for matrix output.
     */
    private final ShowMatrix showMatrix = ShowMatrix.getInstance();

    /**
     * The number of cells that the thread fills.
     */
    private final int numberCells;

    /**
     * Position in the matrix
     */
    private int position;


    public SecondFillingThread(final int numberCells, final int position, final Semaphore sem) {
        this.sem = sem;
        this.numberCells = numberCells;
        this.position = position;
        id = ++uniqueNumber;
    }

    /** Fills in the diagonal elements of the matrix and
     * calls the method to output the matrix to a file. Use semaphore.
     */
    @Override
    public void run() {
        try {
            log.debug(() -> Thread.currentThread().getName() + " started");
            sem.acquire();
            for (int i = position; i < numberCells + position; i++) {
                if (!matrix.getMatrix()[i][i].isState()) {
                    matrix.getMatrix()[i][i].setValue(id);
                    matrix.getMatrix()[i][i].setState(true);
                    log.debug("Value set");
                    TimeUnit.MILLISECONDS.sleep(300);
                    showMatrix.show();
                }
            }
        } catch (InterruptedException e) {
            log.warn("InterruptedException");
            Thread.currentThread().interrupt();
        } finally {
            sem.release();
        }
    }
}
