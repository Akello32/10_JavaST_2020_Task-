package by.matmux.controller.command;

import by.matmux.view.Consumer;

public class WrongRequest implements Command {
    @Override
    public String execute(String text, Consumer consumer) {
        return "wrong request";
    }
}
