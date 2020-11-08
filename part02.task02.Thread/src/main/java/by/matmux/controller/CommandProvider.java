package by.matmux.controller;

import by.matmux.controller.command.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {
    private static final Logger log = LogManager.getLogger(CommandProvider.class);
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.FIRST_SOLUTION, new CallsFirstSolutionCommand());
        repository.put(CommandName.SECOND_SOLUTION, new CallSecondSolCommand());
        repository.put(CommandName.THIRD_SOLUTION, new CallThirdSolCommand());
        repository.put(CommandName.FOURTH_SOLUTION, new CallFourthSolCommand());
    }

    Command getCommand(final String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException ex) {
            log.debug("IllegalArgumentException");
        } catch ( NullPointerException ex) {
            log.debug("NullPointerException");
        }

        return command;
    }
}
