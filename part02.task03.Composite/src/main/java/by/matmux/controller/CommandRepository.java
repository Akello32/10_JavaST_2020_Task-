package by.matmux.controller;

import by.matmux.controller.command.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandRepository {
    private final Map<CommandType, Command> repository = new HashMap<>();

    CommandRepository() {
        repository.put(CommandType.SORT_LEXEME, new LexemeQueryCommand());
        repository.put(CommandType.SORT_PARAGRAPH, new ParagraphQueryCommand());
        repository.put(CommandType.SORT_WORD, new WordQueryCommand());
    }

    Command getCommand(String name){
        if (name == null || name.equals("")) { return null; }
        CommandType commandName = null;
        Command command = null;
        try {
            commandName = CommandType.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch(IllegalArgumentException e) {
            command = repository.get(CommandType.WORD_REQ);
        }
        return command;
    }
}
