package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.CheckQuantityColor;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class QuantityColor implements Command {
    /**
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call checkQuantity
     */
    @Override
    public String execute(final BasketList basketList, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CheckQuantityColor checkQuantityColor = serviceFactory.getCheckQuantityColor();

        return checkQuantityColor.checkQuantity(basketList.getBasket(consumer.enterNumBasket()), consumer.enterColorBall());
    }
}
