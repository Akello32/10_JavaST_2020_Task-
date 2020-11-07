package by.matmux.controller;

import by.matmux.beans.Matrix;
import by.matmux.controller.command.Command;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();

    public void execute(final String request, final Matrix matrix) {
        String commandName = request;
        Command command;

        command = provider.getCommand(commandName);

        command.execute(matrix);
    }
}
