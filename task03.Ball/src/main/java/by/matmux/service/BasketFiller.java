package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;

public class BasketFiller {
    public Basket basketFiller (int numOfBalls, Basket b1) {
        for (int i = 0; i < numOfBalls; i++) { b1.addBallInToList(new Ball()); }
        return b1;
    }
}
