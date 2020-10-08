package by.matmux.controller.command;

import by.matmux.bean.JaggedArray;
import by.matmux.service.jaggedarraysmethod.JaggedArrayFactory;
import by.matmux.view.Consumer;

public class CheckSquareCommand implements Command<Boolean, JaggedArray, Consumer> {
    @Override
    public Boolean execute(JaggedArray array, Consumer consumer) {
        JaggedArrayFactory jaggedArrayFactory = JaggedArrayFactory.getInstance();
        return jaggedArrayFactory.getCheckSquare().isSquare(array);
    }
}
