package by.matmux.controller.command;

import by.matmux.beans.Matrix;

public interface Command {
    void execute(Matrix matrix);
}
