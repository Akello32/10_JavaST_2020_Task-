package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.Color;

public class CheckQuantityColor {
    public String checkQuantity(final Basket basket, final Color colour) {
        int quantityBalls = 0;
        if (basket.getBallsList().isEmpty()) {
            System.out.println("Basket is empty \n");
        } else {
            for (Ball b : basket.getBallsList()) {
                if (b.getColor() == colour) {
                    quantityBalls++;
                }
            }
        }
        return "Balls of " + colour.toString() + " " + quantityBalls  + " \n";
    }
}
