package by.matmux.controller;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;
import by.matmux.service.*;
import by.matmux.view.Consumer;
import by.matmux.view.Menu;

public class Controller {
    public static void main(String[] args) {
        BasketList basketList = new BasketList();
        selectOptions(basketList);
    }

    /**
     * A method that allows the user to select the desired function
     */

    // TODO сделать меню для пользователя добавить JavaDoc к методам, доработать слой view

    public static void selectOptions(final BasketList basketList) {
        boolean chooses = true;
        int selectedNum = 0;
        Consumer consumer = new Consumer();
        BasketFiller basketFiller = new BasketFiller();
        CheckEqualityBall ballsEqual = new CheckEqualityBall();
        CheckBasketEqual basketEqual = new CheckBasketEqual();
        CheckWeight checkWeight = new CheckWeight();
        CheckQuantityColor quantityColor = new CheckQuantityColor();
        OutputToCost toCost = new OutputToCost();
        Menu menu = new Menu();
        menu.showMenu();

        while (chooses) {
            selectedNum = consumer.enterChoiceNumber();
            switch (selectedNum) {
                case 1:
                    basketList.addBasketInToList(new Basket());
                    menu.showMenu();
                    break;
                case 2:
                    System.out.println("Enter the number of balls and the basket number");
                    basketFiller.basketRandomFiller( consumer.returnInt()
                            , basketList.getBasket(consumer.returnInt() - 1));
                    break;
                case 3:
                    System.out.println(basketList.getBasket(consumer.returnInt() - 1).toString());
                    break;
                case 4:
                    System.out.println("Enter the basket number");
                    System.out.println("Enter color");
                    int i = ballsEqual.checkEquality(basketList.getBasket(consumer.returnInt() -1 ), consumer.enterColor());
                    System.out.println(i);
                    break;
                case 5:
                    basketEqual.checkBasketEqual(basketList);
                    break;
                case 6:
                    System.out.println("Enter the basket number");
                    System.out.println(checkWeight.checkWeight(basketList.getBasket(consumer.returnInt() - 1)));
                    break;
                case 7 :
                    System.out.println("Enter the basket number");
                    System.out.println("Enter color");
                    int j = quantityColor.checkQuantity(basketList.getBasket(consumer.returnInt() - 1),
                            consumer.enterColor());
                    System.out.println(j);
                    break;
                case 8 :
                    System.out.println("Enter the basket number");
                    System.out.println(toCost.outputToCost(basketList.getBasket(consumer.returnInt() - 1)));
                    break;
                case 9 : chooses = false;
            }
        }
    }
}
