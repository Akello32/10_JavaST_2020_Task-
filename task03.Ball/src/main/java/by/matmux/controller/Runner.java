/**
 * Class that starts the program and calls the user menu
 */

package by.matmux.controller;

import by.matmux.bean.BasketList;
import by.matmux.view.Consumer;

public class Runner {
    public static void main(String[] args) {
        final Controller controller = new Controller();
        final BasketList basketList = new BasketList();
        final Consumer consumer = new Consumer();
        boolean choice = true;
        String selectedCommand;

        while(choice) {
            selectedCommand = consumer.setRequest();

            if (selectedCommand.equals("FILL_YOURSELF")) {
                consumer.fillTheBasket(basketList.getBasket(consumer.enterNumBasket()));
                continue;
            }

            if (selectedCommand.equals("EXIT")) {
                choice = false;
            }

            consumer.show(controller.execute(selectedCommand, basketList, consumer));
        }
    }
}
