package by.matmux.controller;

import by.matmux.controller.command.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.ADD_BOOK, new AddBookCommand());
        repository.put(CommandName.ADD_JOURNAL, new AddJournalCommand());
        repository.put(CommandName.ADD_AlBUM, new AddAlbumCommand());
        repository.put(CommandName.REMOVE_BOOK, new RemoveBookCommand());
        repository.put(CommandName.REMOVE_JOURNAL, new RemoveJournalCommand());
        repository.put(CommandName.REMOVE_ALBUM, new RemoveAlbumCommand());
        repository.put(CommandName.SORT_BOOK_BY_TITLE, new SortTitleCommand());
        repository.put(CommandName.SORT_BOOK_BY_AUTHORS, new SortAuthorsCommand());
        repository.put(CommandName.SORT_BOOK_BY_DATE, new SortDateCommand());
        repository.put(CommandName.SORT_BOOK_BY_NUMBER_PAGES, new SortPagesCommand());
        repository.put(CommandName.SORT_BOOK_BY_PUBLISHING_HOUSE, new SortHouseCommand());
        repository.put(CommandName.FIND_BOOK_BY_TITLE, new SearchTitleCommand());
        repository.put(CommandName.FIND_BOOK_BY_AUTHORS, new SearchAuthorsCommand());
        repository.put(CommandName.FIND_BOOK_BY_NUMBER_PAGES, new SearchPagesCommand());
        repository.put(CommandName.FIND_BOOK_BY_PUBLISHING_HOUSE, new SearchHouseCommand());
        repository.put(CommandName.FIND_BOOK_BY_DATE, new SearchDateCommand());
        repository.put(CommandName.SET_BOOK_FROM_FILES, new SetBooksCommand());
    }

    Command getCommand(String name){
        if (name == null || name.equals("")) { return null; }
        CommandName commandName = null;
        Command command = null;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException e){
            command = repository.get(CommandName.WRONG_REQ);
        }
        return command;
    }
}
