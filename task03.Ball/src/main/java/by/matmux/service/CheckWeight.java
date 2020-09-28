package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;

public class CheckWeight {
    /**
     * @param basket
     * @return row with the total weight of balls in the basket
     */
    public String checkWeight(final Basket basket) {
        int sumWeight = 0;
        if (basket.getBallsList().isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            for (Ball b : basket.getBallsList()) {
                sumWeight += b.getWeight();
            }
        }
        return "total weight of balls in the basket - " + sumWeight + " \n";
    }
}
