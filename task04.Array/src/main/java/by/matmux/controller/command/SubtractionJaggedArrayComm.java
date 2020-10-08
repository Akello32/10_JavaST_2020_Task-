package by.matmux.controller.command;

import by.matmux.bean.JaggedArray;
import by.matmux.service.jaggedarraysmethod.JaggedArrayFactory;

public class SubtractionJaggedArrayComm implements Command<String, JaggedArray, JaggedArray> {
    @Override
    public String execute(JaggedArray jaggedArray, JaggedArray jaggedArray2) {
        JaggedArrayFactory jaggedArrayFactory = JaggedArrayFactory.getInstance();
        return jaggedArrayFactory.getSubtractionJaggedArr().subtraction(jaggedArray, jaggedArray2);
    }
}
