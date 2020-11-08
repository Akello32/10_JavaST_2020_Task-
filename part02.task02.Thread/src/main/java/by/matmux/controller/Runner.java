package by.matmux.controller;

import by.matmux.beans.Matrix;
import by.matmux.service.SetMatrixFromFile;
import by.matmux.view.Consumer;

public class Runner {
    public static void main(String[] args) {
        final Consumer consumer = new Consumer();
        final Matrix matrix = Matrix.getInstance();
        final Controller controller = new Controller();
        boolean choice = true;

        while (choice) {
            consumer.showSol();
            String request = consumer.enterRequest();
            SetMatrixFromFile.set(matrix);
            if (request.equals("EXIT")) {
                choice = false;
            } else {
                controller.execute(request, matrix);
            }
        }
    }
}
