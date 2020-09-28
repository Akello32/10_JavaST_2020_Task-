package by.matmux.controller.command;

import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;
import by.matmux.view.Consumer;

public class AddBasket implements Command {
    /**
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call addBasketInToList
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        basketList.addBasketInToList(new Basket());
        return "new basket created \n";
    }
}
