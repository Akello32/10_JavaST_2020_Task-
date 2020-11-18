package by.matmux.service.third_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.ShowMatrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class    ThirdFillingThread extends Thread {
    /**
     * Logger.
     */
    private static final Logger log = LogManager.getLogger(ThirdFillingThread.class);

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

    /**
     * CountDown for blocking.
     */
    private CountDownLatch countDown;

    /**
     * Semaphore.
     */
    private Semaphore sem;

    public ThirdFillingThread(final int numberCells, final int position, final Semaphore sem) {
        this.sem = sem;
        this.numberCells = numberCells;
        this.position = position;
        this.countDown = new CountDownLatch(numberCells);
        id = ++uniqueNumber;
    }

    public int getNumberCells() {
        return numberCells;
    }

    public int getPosition() {
        return position;
    }

    public CountDownLatch getCountDown() {
        return countDown;
    }

    /**
     * Fills in the diagonal elements of the matrix and
     * calls the method to output the matrix to a file
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
                    TimeUnit.MILLISECONDS.sleep(300);
                    log.debug(() -> Thread.currentThread().getName() + ": Value set");

                    countDown.await();
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
