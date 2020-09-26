package by.matmux.controller;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;
import by.matmux.service.BasketFiller;
import by.matmux.service.CheckBasketEqual;
import by.matmux.service.CheckEqualityBall;
import by.matmux.service.CheckWeight;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BasketList bl = new BasketList();
        BasketFiller bf = new BasketFiller();

        bf.basketFiller(14, bl.getBasketList().get(0));
        System.out.println(bl.getBasketList().get(0).toString());
        bl.addBasketInToList(new Basket());
        bf.basketFiller(14, bl.getBasketList().get(1));

        CheckEqualityBall checkEqualityBall = new CheckEqualityBall();
        int arr = checkEqualityBall.checkEquality(bl);
        System.out.println(arr);

        CheckBasketEqual checkBasketEqual = new CheckBasketEqual();
        int count = checkBasketEqual.checkBasketEqual(bl);
        System.out.println("count  = " + count);

    }
}
