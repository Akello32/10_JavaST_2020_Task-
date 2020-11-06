package by.matmux.service.first_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.ShowMatrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class FirstFillingThread implements Runnable {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(FirstFillingThread.class);

    /** Thread number counter. */
    private static int uniqueNumber = 9;

    /** Thread id. */
    private int id;

    /** Matrix. */
    private final Matrix matrix = Matrix.getInstance();

    /** Object for matrix output. */
    private final ShowMatrix showMatrix = ShowMatrix.getInstance();

    /** The number of cells that the thread fills. */
    private final int numberCells;

    /** Lock. */
    private ReentrantLock lock;

    public FirstFillingThread(final int numberCells, final ReentrantLock lock) {
        this.lock = lock;
        this.numberCells = numberCells;
         id = ++uniqueNumber;
    }

    /** Fills in the diagonal elements of the matrix and
     * calls the method to output the matrix to a file
     */
    @Override
    public void run() {
        lock.lock();
        int count = 0;
        try {
            log.debug(() -> Thread.currentThread().getName() + " started");
            for (int i = 0; i < matrix.length(); i++) {
                TimeUnit.MILLISECONDS.sleep(200);
                if (!matrix.getMatrix()[i][i].isState() && count != numberCells) {
                    matrix.getMatrix()[i][i].setValue(id);
                    matrix.getMatrix()[i][i].setState(true);
                    log.debug("Value set");
                    count++;
                    showMatrix.show();
                }
            }
        } catch (InterruptedException e) {
            log.warn("InterruptedException");
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}
