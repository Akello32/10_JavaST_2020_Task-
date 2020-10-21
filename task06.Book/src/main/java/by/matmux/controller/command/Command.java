package by.matmux.controller.command;

import by.matmux.view.Consumer;

public interface Command {
    Object execute(Consumer consumer);
}
