package by.matmux.task1.controller;

import by.matmux.task1.bean.Number;
import by.matmux.task1.service.TestingForPerfection;
import by.matmux.task1.view.Consumer;

import java.io.IOException;

public class Runner extends Number {
    public static void main(String[] args) throws IOException {
        Number testNumber = new Number();

        testNumber.setValue(Consumer.enterNumbers());

        testNumber.setCheck(TestingForPerfection.testingForPerfection(testNumber));

        Consumer.showResult(testNumber);
    }
}


