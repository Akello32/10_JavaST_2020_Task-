package by.matmux.controller;

import by.matmux.beans.Matrix;
import by.matmux.service.SetMatrixFromFile;
import by.matmux.service.calling_thread.CallSecondSolution;

public class Runner {
    public static void main(String[] args) {
        final Matrix matrix = Matrix.getInstance();
        final Controller controller = new Controller();
        SetMatrixFromFile.set(matrix);
//         controller.execute("FIRST_SOLUTION", matrix);
        CallSecondSolution call = new CallSecondSolution();
        call.call(matrix);
    }
}
