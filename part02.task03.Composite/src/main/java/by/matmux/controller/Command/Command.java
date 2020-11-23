package by.matmux.controller.Command;

import by.matmux.bean.TextComposite;

public interface Command {
    String execute(TextComposite composite);
}
