package by.matmux.controller;

import by.matmux.controller.command.CallsFirstSolutionCommand;
import by.matmux.controller.command.Command;
import by.matmux.controller.command.CommandName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {
    private static final Logger log = LogManager.getLogger(CommandProvider.class);
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.FIRST_SOLUTION, new CallsFirstSolutionCommand());
    }

    Command getCommand(final String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException ex) {
            log.warn("IllegalArgumentException");
        } catch ( NullPointerException ex) {
            log.warn("NullPointerException");
        }

        return command;
    }
}
