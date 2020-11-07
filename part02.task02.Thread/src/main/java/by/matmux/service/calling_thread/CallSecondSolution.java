package by.matmux.service.calling_thread;

import by.matmux.beans.Matrix;
import by.matmux.controller.Runner;
import by.matmux.service.SetNumberOfThread;
import by.matmux.service.second_solution.SecondFillingThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Semaphore;

public class CallSecondSolution {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(Runner.class);

    /** Number of thread. */
    private int M;

    /** Calls the second solution. */
    public void call(Matrix matrix) {
        M = SetNumberOfThread.set();
        Semaphore sem = new Semaphore(M, true);
        int[] res = numberCells(M, matrix.length());
        for (int i = 0; i < M; i++) {
            if (i == (M - 1)) {
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
