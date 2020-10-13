package by.matmux.controller.command;

import by.matmux.view.Consumer;

public interface Command {
    public String execute(String text, Consumer consumer);
}
