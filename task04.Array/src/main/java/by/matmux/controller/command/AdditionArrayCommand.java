package by.matmux.controller.command;

import by.matmux.bean.JaggedArray;
import by.matmux.service.jaggedarraysmethod.JaggedArrayFactory;

public class AdditionArrayCommand implements Command<String, JaggedArray, JaggedArray>{
    @Override
    public String execute(JaggedArray array1, JaggedArray array2) {
        JaggedArrayFactory jaggedArrayFactory = JaggedArrayFactory.getInstance();
        return jaggedArrayFactory.getAdditionJaggedArr().addition(array1, array2);
    }
}
