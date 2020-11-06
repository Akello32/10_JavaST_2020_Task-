package by.matmux.controller;

import by.matmux.beans.Matrix;
import by.matmux.service.first_solution.FirstFillingThread;
import by.matmux.service.SetMatrixFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        Matrix matrix = Matrix.getInstance();
        final ReentrantLock lock = new ReentrantLock();
        int M = 8;
        SetMatrixFromFile set = new SetMatrixFromFile();
        set.set(matrix);

        int[] res = numberCells(M, matrix.length());
        for (int i = 0; i <= M; i++) {
            if (i == M) {
                Thread t = new Thread(new FirstFillingThread(res[1], lock));
                t.setName("Thread" + i);
                t.start();
                continue;
            }
            Thread t = new Thread(new FirstFillingThread(res[0], lock));
            t.setName("Thread" + i);
            t.start();
        }
    }

    private static int[] numberCells(final int M, final int N) {
        int[] res = new int[2];
        res[0] = N / M;
        res[1] = N - (res[0] * M);

        return res;
    }
}
