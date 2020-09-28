package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.BasketFiller;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class Filler implements Command {
    /**
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call basketRandomFiller
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BasketFiller basketFiller = serviceFactory.getBasketFiller();

        return basketFiller.basketRandomFiller(consumer.enterNum(), basketList.getBasket(consumer.enterNumBasket()));
    }
}
