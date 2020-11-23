package by.matmux.controller;

import by.matmux.bean.TextComposite;
import by.matmux.controller.Command.Command;

public class Controller {
    private final CommandRepository provider = new CommandRepository();

    public String execute(String request, TextComposite composite) {
        Command executionCommand;
        executionCommand = provider.getCommand(request);
        String response;
        response = executionCommand.execute(composite);
        return response;
    }
}
