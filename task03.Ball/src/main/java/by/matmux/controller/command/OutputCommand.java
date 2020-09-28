package by.matmux.controller.command;

import by.matmux.bean.Basket;
import by.matmux.bean.BasketList;
import by.matmux.bean.Color;
import by.matmux.controller.command.Command;
import by.matmux.service.OutputToCost;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class OutputCommand implements Command {
    /**
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call outputToCost
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        OutputToCost outputToCost = serviceFactory.getOutputToCost();

        return outputToCost.outputToCost(basketList.getBasket(consumer.enterNumBasket()));
    }
}
