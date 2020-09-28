package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.CheckWeight;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class WeightCommand implements Command {
    /**
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call checkWeight
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CheckWeight checkWeight = serviceFactory.getCheckWeight();

        return checkWeight.checkWeight(basketList.getBasket(consumer.enterNumBasket()));
    }
}
