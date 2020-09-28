package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.service.CheckEqualityBall;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class EqualityBall implements Command {
    /**
     *
     * @param basketList
     * @param consumer
     * @return a string with the result of a function call checkEquality
     */
    @Override
    public String execute(BasketList basketList, Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CheckEqualityBall checkEqualityBall = serviceFactory.getCheckEqualityBall();

        return checkEqualityBall.checkEquality(basketList.getBasket(consumer.enterNumBasket()), consumer.enterColorBall());
    }
}
