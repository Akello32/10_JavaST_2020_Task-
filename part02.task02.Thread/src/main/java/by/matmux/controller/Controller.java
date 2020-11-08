package by.matmux.controller;

import by.matmux.beans.Matrix;
import by.matmux.controller.command.Command;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();

    public void execute(final String request, final Matrix matrix) {
        Command command;
        command = provider.getCommand(request);
        command.execute(matrix);
    }
}
