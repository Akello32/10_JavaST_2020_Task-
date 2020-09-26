package by.matmux.controller;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Basket> basketList = new ArrayList<>();
        basketList.add(new Basket());
        basketList.get(0).addBallInToList(new Ball());
    }
}

/*        Basket basket1 = new Basket();
        basket1.addBallInToList(new Ball());
        basket1.addBallInToList(new Ball());
        basket1.addBallInToList(new Ball());
        basket1.addBallInToList(new Ball());*/
