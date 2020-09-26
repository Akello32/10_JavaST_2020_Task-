package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CheckEqualityBall {
    public int checkEquality(final BasketList basketList) {
        ArrayList<Ball> listOfBall = basketList.getBasketList().get(0).getBallsList();
        int countOfEqualBalls = 0;
        for (Basket basket : basketList.getBasketList()) {
            for (Ball ball : listOfBall) {
                Set set = new HashSet<>();
                set.addAll(listOfBall);
                countOfEqualBalls = listOfBall.size() - set.size();
            }
        }
        return countOfEqualBalls;
    }
}
