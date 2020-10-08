package by.matmux.controller.command;

import by.matmux.bean.Array;
import by.matmux.service.arraymethod.ArrayMethodFactory;
import by.matmux.view.Consumer;

public class ShuttleSortCommand implements Command<String, Array, Consumer> {
    @Override
    public String execute(Array array, Consumer consumer) {
        ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();
        return arrayMethodFactory.getSort().shuttleSort(array);
    }
}
