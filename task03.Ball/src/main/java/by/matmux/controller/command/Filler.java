package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.BasketRandomFiller;
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
        BasketRandomFiller basketRandomFiller = serviceFactory.getBasketFiller();

        return basketRandomFiller.basketRandomFiller(consumer.enterNum(), basketList.getBasket(consumer.enterNumBasket()));
    }
}
