package by.matmux.controller.command;

import by.matmux.bean.Array;
import by.matmux.service.arraymethod.ArrayMethodFactory;
import by.matmux.view.Consumer;

public class BinarySearchCommand implements Command<Integer, Array, Consumer> {
    public Integer execute(Array array, Consumer consumer) {
        ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();
        return arrayMethodFactory.getBinarySearch().binarySearch(array, consumer.enterNumber());
    }
}
