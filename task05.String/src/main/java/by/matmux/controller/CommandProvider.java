package by.matmux.controller;

import by.matmux.controller.command.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.CHANGE_CHAR, new ChangeCharCommand());
        repository.put(CommandName.CHANGE_WORD, new ChangeWordCommand());
        repository.put(CommandName.MISTAKE_CHANGE, new MistakeChangeCommand());
        repository.put(CommandName.DELETING_WORDS, new DeletingWordsCommand());
        repository.put(CommandName.REMOVE_ALL_EXCEPT_LETTER, new RemoveAllCommand());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    /**
     * Returns a command based on the passed command name
     * @param name - command name
     * @return the desired command
     */
    public Command getCommand(String name) {
        CommandName commandName =null;
        Command command = null;

        if (name == null) { return command = repository.get(CommandName.WRONG_REQUEST); }

        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}

