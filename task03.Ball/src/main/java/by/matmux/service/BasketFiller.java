package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;

/**
 *
 */
public class BasketFiller {
    public Basket basketRandomFiller (int number ,Basket b1) {
        for (int i = 0; i < number; i++) { b1.addBallInToList(new Ball()); }
        return b1;
    }
}
