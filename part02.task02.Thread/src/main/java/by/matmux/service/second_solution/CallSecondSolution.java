package by.matmux.service.second_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.CheckMatrix;
import by.matmux.service.SetNumberOfThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CallSecondSolution {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(CallSecondSolution.class);

    /** Calls the second solution. */
    public void call(Matrix matrix) {
        int m = SetNumberOfThread.set();
        Semaphore sem = new Semaphore(m, true);
        CheckMatrix checkMatrix = new CheckMatrix();
        int[] res = numberCells(m, matrix.length());
        for (int i = 0; i < m; i++) {
            if (i == (m - 1)) {
                Thread t = new Thread(new SecondFillingThread(res[1] == res[0] ? res[0] : res[1] + res[0] ,
                        i * res[0], sem));
                t.setName("Thread" + (i + 1));
                t.start();
                continue;
            }
            Thread t = new Thread(new SecondFillingThread(res[0], i * res[0], sem));
            t.setName("Thread" + (i + 1));
            t.start();
        }

        try {
            TimeUnit.MILLISECONDS.sleep(matrix.length() * 400L);
            new Thread(checkMatrix).start();
        } catch (InterruptedException ex) {
            log.debug("InterruptedException when calling the check");
            Thread.currentThread().interrupt();
        }
    }

    /** Sets the number of cells that the thread fills */
    private static int[] numberCells(final int M, final int N) {
        int[] res = new int[2];
        if (N % M == 0) {
            res[0] = N/M;
            res[1] = res[0];
            return res;
        }
        res[0] = N / M;
        res[1] = N - (res[0] * M);

        return res;
    }
}