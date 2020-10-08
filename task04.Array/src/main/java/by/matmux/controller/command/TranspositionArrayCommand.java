package by.matmux.controller.command;

import by.matmux.bean.JaggedArray;
import by.matmux.service.jaggedarraysmethod.JaggedArrayFactory;
import by.matmux.view.Consumer;

public class TranspositionArrayCommand implements Command<JaggedArray, JaggedArray, Consumer> {
    @Override
    public JaggedArray execute(JaggedArray array, Consumer consumer) {
        JaggedArrayFactory jaggedArrayFactory = JaggedArrayFactory.getInstance();
        return jaggedArrayFactory.getTranspositionArray().transposition(array);
    }
}
