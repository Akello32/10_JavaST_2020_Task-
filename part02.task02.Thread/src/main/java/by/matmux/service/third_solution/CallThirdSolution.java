package by.matmux.service.third_solution;

import by.matmux.beans.Matrix;
import by.matmux.service.SetNumberOfThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CallThirdSolution {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(CallThirdSolution.class);

    /** Calls the second solution. */
    public void call(Matrix matrix) {
        int m = SetNumberOfThread.set();
        Semaphore sem = new Semaphore(m, true);
        int[] res = numberCells(m, matrix.length());
        List<ThirdFillingThread> threads = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            if (i == (m - 1)) {
                threads.add(new ThirdFillingThread(res[1] == res[0] ? res[0] : res[1] + res[0],
                        i * res[0], sem));
                threads.get(i).setName("Thread" + (i + 1));
                continue;
            }
            threads.add(new ThirdFillingThread(res[0], i * res[0], sem));
            threads.get(i).setName("Thread" + (i + 1));
        }
        ControllerThread controllerThread = new ControllerThread(threads);

        for (ThirdFillingThread th : threads) {
            th.start();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(7000);
        } catch (InterruptedException e) {
            log.debug("InterruptedException when waiting for started controllerThread");
            Thread.currentThread().interrupt();
        }
        controllerThread.start();
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
