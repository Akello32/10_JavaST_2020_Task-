package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.Color;

public class CheckQuantityColor {
    public int checkQuantity(final Basket basket, final Color colour) {
        int quantityBalls = 0;
        if (basket.getBallsList().isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            for (Ball b : basket.getBallsList()) {
                if (b.getColor() == colour) {
                    quantityBalls++;
                }
            }
        }
        return quantityBalls;
    }
}
