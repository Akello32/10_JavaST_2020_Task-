package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.CheckBasketEqual;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class BasketEqual implements Command {
    /**
     *
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call checkBasketEqual
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CheckBasketEqual checkBasketEqual = serviceFactory.getCheckBasketEqual();

        return checkBasketEqual.checkBasketEqual(basketList);
    }
}
