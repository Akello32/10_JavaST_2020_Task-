package by.matmux.controller;

import by.matmux.bean.Array;
import by.matmux.bean.JaggedArray;
import by.matmux.controller.command.Command;
import by.matmux.view.Consumer;

public final class Controller<K, P> {
    private final CommandProvider provider = new CommandProvider();

    public Object executeTask(String request, K k, P p) {
        String commandName = request;
        Command command;

        command = provider.getCommand(commandName);

        Object response;
        response = command.execute(k, p);

        return response;
    }
}
