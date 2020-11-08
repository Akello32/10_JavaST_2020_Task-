package by.matmux.service.fourth_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.ShowMatrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class FourthFillingThread extends Thread {
    /**
     * Logger.
     */
    private static final Logger log = LogManager.getLogger(FourthFillingThread.class);
    /**
     * Phaser.
     */
    private Phaser phaser;

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

    public FourthFillingThread(final int numberCells, final Phaser phaser) {
        this.phaser = phaser;
        this.numberCells = numberCells;
        id = ++uniqueNumber;
    }

    /**
     * Fills in the diagonal elements of the matrix and
     * calls the method to output the matrix to a file. Use semaphore.
     */
    @Override
    public void run() {
        int count = 0;
        try {
            log.debug(() -> Thread.currentThread().getName() + " started");
            for (int i = 0; i < matrix.length(); i++) {
                if (!matrix.getMatrix()[i][i].isState() && count != numberCells) {
                    matrix.getMatrix()[i][i].setValue(id);
                    matrix.getMatrix()[i][i].setState(true);
                    log.debug("Value set");
                    TimeUnit.MILLISECONDS.sleep(300);
                    count++;
                    showMatrix.show();
                }
                if (count == numberCells) {
                    phaser.arriveAndAwaitAdvance();
                    log.debug(() -> Thread.currentThread().getName() + " finished");
                    break;
                }
            }
            phaser.arriveAndDeregister();
        } catch (InterruptedException e) {
            log.warn("InterruptedException");
            Thread.currentThread().interrupt();
        }
    }
}


