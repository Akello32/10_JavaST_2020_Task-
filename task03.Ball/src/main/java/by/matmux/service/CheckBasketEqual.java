package by.matmux.service;

import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;

public class CheckBasketEqual {
    /**
     * @param basketList
     * @return string with the result of executing the function,
     * compares baskets by the set of balls in them
     */
    public String checkBasketEqual(final BasketList basketList) {
        int countOfEqualityBasket = 0;
        int countOfEqualityBalls = 0;
        
        if (basketList.getSizeList() == 1 || basketList.getSizeList() == 0) {
            return "Not found the same baskets \n";
        }

        for (int i = 0; i < basketList.getSizeList(); i++) {
            Basket firstList = basketList.getBasket(i);
            Basket secondList = basketList.getBasket(i + 1);

            if (firstList.getSizeBasket() != secondList.getSizeBasket()) {
                return "Not found the same baskets \n";
            }

            for (int k = 0; k < firstList.getSizeBasket(); k++) {
                for (int j = 0; j < secondList.getSizeBasket(); j++) {
                    if (!firstList.getBall(k).equals(firstList.getBall(j))) {
                        k = firstList.getSizeBasket();
                    } else {
                        countOfEqualityBalls++;
                    }
                }
            }

            if (countOfEqualityBalls == firstList.getSizeBasket()) {
                countOfEqualityBasket++;
            }
        }

        return  "You have a " + countOfEqualityBasket + " equals baskets \n";
    }
}
