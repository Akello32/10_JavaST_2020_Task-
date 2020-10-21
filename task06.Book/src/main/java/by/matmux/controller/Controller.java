package by.matmux.controller;

import by.matmux.controller.command.Command;
import by.matmux.view.Consumer;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public Object execute(String request, Consumer consumer) {
        Command executionCommand;
        executionCommand = provider.getCommand(request);
        Object response;
        response = executionCommand.execute(consumer);
        return response;
    }
}
