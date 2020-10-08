package by.matmux.service;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.Color;


public class BasketFiller {
    /**
     *
     * @param number
     * @param b1
     * @return string with the result of the function,
     * fills the passed basket with random balls
     */
    public String basketRandomFiller (final int number ,final Basket b1) {
        for (int i = 0; i < number; i++) {
            Color color = Color.GREEN;
            color = color.getRandomColor();
            int cost = (int) (Math.random() * number) + 1;
            int weight = (int) (Math.random() * number) + 1;
            Ball ball = new Ball(color, cost, weight);
            b1.addBallInToList(ball);
        }

        return "Basket is full \n";
    }
}
