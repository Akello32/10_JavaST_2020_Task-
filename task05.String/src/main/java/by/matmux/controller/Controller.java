package by.matmux.controller;

import by.matmux.controller.command.Command;
import by.matmux.view.Consumer;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String executeTask(final String request, final String text, final Consumer consumer) {
        String commandName = request;
        Command command;

        command = provider.getCommand(commandName);

        String response;
        response = command.execute(text, consumer);

        return response;
    }
}
