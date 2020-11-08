package by.matmux.controller.command;

import by.matmux.beans.Matrix;
import by.matmux.service.ServiceFactory;

public class CallSecondSolCommand implements Command {
    @Override
    public void execute(Matrix matrix) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        serviceFactory.getSecondSolution().call(matrix);
    }
}
