package by.matmux.controller.command;

import by.matmux.bean.Array;
import by.matmux.service.arraymethod.ArrayMethodFactory;
import by.matmux.view.Consumer;

import java.util.ArrayList;

public class FindThreeDigitCommand implements Command<ArrayList, Array, Consumer> {
    @Override
    public ArrayList execute(Array array, Consumer consumer) {
        ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();
        return arrayMethodFactory.getFindThreeDigit().find(array);
    }
}
