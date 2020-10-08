package by.matmux.controller.command;

import by.matmux.bean.Array;
import by.matmux.service.arraymethod.ArrayMethodFactory;
import by.matmux.view.Consumer;

public class FindMaxCommand implements Command<Integer, Array, Consumer>{
    @Override
    public Integer execute(Array array, Consumer consumer) {
        ArrayMethodFactory arrayMethodFactory = ArrayMethodFactory.getInstance();
        return arrayMethodFactory.getFindMax().max(array.getArr());
    }
}
