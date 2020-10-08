package by.matmux.controller.command;

import by.matmux.bean.Array;
import by.matmux.service.arraymethod.ArrayMethodFactory;
import by.matmux.view.Consumer;

import java.util.ArrayList;

public class FibonachiNumbersCommand implements Command<ArrayList<Integer>, Array, Consumer> {
    @Override
    public ArrayList execute(Array array, Consumer consumer) {
        ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();
        return arrayMethodFactory.getFibonachiNumbers().find(array);
    }
}
