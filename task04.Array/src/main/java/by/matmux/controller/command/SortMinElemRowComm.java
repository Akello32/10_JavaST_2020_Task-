package by.matmux.controller.command;

import by.matmux.bean.JaggedArray;
import by.matmux.service.jaggedarraysmethod.JaggedArrayFactory;
import by.matmux.view.Consumer;

public class SortMinElemRowComm implements Command<String, JaggedArray, Consumer> {
    @Override
    public String execute(JaggedArray array, Consumer consumer) {
        JaggedArrayFactory jaggedArrayFactory = JaggedArrayFactory.getInstance();
        return jaggedArrayFactory.getSortJaggedArray().minElemRow(array, consumer.enterBoolean());
    }
}
