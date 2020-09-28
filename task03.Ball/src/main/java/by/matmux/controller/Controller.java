/**
 * Class that calls the command menu
 */

package by.matmux.controller;

import by.matmux.bean.BasketList;
import by.matmux.controller.command.Command;
import by.matmux.view.Consumer;


public final class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String execute(final String request, final BasketList basketList, final Consumer consumer) {
        String commandName = request;
        Command command;

        command = provider.getCommand(commandName);

        String response;
        response = command.execute(basketList, consumer);

        return response;
    }
}
