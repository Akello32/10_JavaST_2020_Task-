package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;
import by.matmux.bean.Color;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CheckEqualityBall {
    public String checkEquality(final Basket basket, final Color color) {

        if (basket.getSizeBasket() == 0 || basket.getSizeBasket() == 1) {
            return "Not found the same balls \n";
        }

        int countOfEqualBalls = 0;
        for (int i = 0; i < basket.getSizeBasket(); i++) {
            Ball ball = basket.getBall(i);
            if (ball.getColor() == color) {
                for (int j = i + 1; j < basket.getSizeBasket(); j++) {
                    if (ball.equals(basket.getBall(j))) {
                        countOfEqualBalls++;
                    }
                }
            }
        }
        return "You have a " + countOfEqualBalls + " equals balls \n";
    }
}
