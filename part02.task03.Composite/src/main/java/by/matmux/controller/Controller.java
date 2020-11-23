package by.matmux.controller;

import by.matmux.controller.command.Command;

public class Controller {
    private final CommandRepository provider = new CommandRepository();

    public String execute(String request) {
        Command executionCommand;
        executionCommand = provider.getCommand(request);
        String response;
        response = executionCommand.execute();
        return response;
    }
}
