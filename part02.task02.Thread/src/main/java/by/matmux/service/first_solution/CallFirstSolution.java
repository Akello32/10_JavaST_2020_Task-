package by.matmux.service.first_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.CheckMatrix;
import by.matmux.service.SetNumberOfThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class CallFirstSolution {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(CallFirstSolution.class);

    /** Lock. */
    final ReentrantLock lock = new ReentrantLock();


    /** Calls the first solution. */
    public void call(Matrix matrix) {
        int m = SetNumberOfThread.set();
        int[] res = numberCells(m, matrix.length());
        CheckMatrix checkMatrix = new CheckMatrix();
        for (int i = 1; i <= m; i++) {
            if (i == m) {
                Thread t = new Thread(new FirstFillingThread(res[1] == res[0] ? res[0] : res[1] + res[0], lock));
                t.setName("Thread" + i);
                t.start();
                continue;
            }
            Thread t = new Thread(new FirstFillingThread(res[0], lock));
            t.setName("Thread" + i);
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
