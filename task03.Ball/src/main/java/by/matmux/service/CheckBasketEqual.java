package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;

import java.util.ArrayList;

// TODO доделать реализацию метода

public class CheckBasketEqual {
    public int checkBasketEqual (final BasketList basketList) {
        int countOfEqualityBasket = 0;

        if (basketList.getBasketList().size() == 1) {
            return 0;
        }

        for (int i = 0; i < basketList.getBasketList().size(); i++) {
            ArrayList<Ball> listOfBall = basketList.getBasketList().get(i).getBallsList();
            for (int k = 0; k < listOfBall.size(); k++) {
                for (int j = k + 1; j < listOfBall.size(); j++) {
                    if (listOfBall.get(k).equals(listOfBall.get(j))) {
                        continue;
                    } else { break; }
                }
            }
            countOfEqualityBasket++;
        }
        return countOfEqualityBasket;
    }
}
