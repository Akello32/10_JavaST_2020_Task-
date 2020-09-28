/**
 * A class that contains a mechanism for accessing command instances
 */

package by.matmux.controller;

import by.matmux.controller.command.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.CHECK_EQUALITY_BALL, new EqualityBall());
        repository.put(CommandName.CHECK_QUANTITY, new QuantityColor());
        repository.put(CommandName.FILLER_BASKET, new Filler());
        repository.put(CommandName.CHECK_WEIGHT, new WeightCommand());
        repository.put(CommandName.OUTPUT_TO_COST, new OutputCommand());
        repository.put(CommandName.CHECK_BASKET_EQUAL, new BasketEqual());
        repository.put(CommandName.ADD_BASKET, new AddBasket());
    }

    Command getCommand(final String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException ex) {
            System.out.println("WRONG REQUEST");
        }

        return command;
    }
}
