package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;

import java.util.Comparator;

public class OutputToCost {
    public String outputToCost(final Basket basket) {
        Comparator<Ball> comparator = Comparator.comparing(obj -> obj.getCost());
        basket.getBallsList().sort(comparator);
        return basket.toString();
    }
}
