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

        repository.put(CommandName.SORT_EDITION_BY_TITLE, new SortTitleCommand());
        repository.put(CommandName.SORT_EDITION_BY_AUTHORS, new SortAuthorsCommand());
        repository.put(CommandName.SORT_EDITION_BY_DATE, new SortDateCommand());
        repository.put(CommandName.SORT_EDITION_BY_NUMBER_PAGES, new SortPagesCommand());
        repository.put(CommandName.SORT_EDITION_BY_PUBLISHING_HOUSE, new SortHouseCommand());
        repository.put(CommandName.SORT_ALBUM_BY_TITLE, new SortAlbumTitleCommand());
        repository.put(CommandName.SORT_BOOK_BY_NUMBER_PAGES, new SortBookPagesCommand());
        repository.put(CommandName.SORT_JOURNAL_BY_AUTHORS, new SortJournalAuthorsCommand());

        repository.put(CommandName.FIND_EDITION_BY_TITLE, new SearchTitleCommand());
        repository.put(CommandName.FIND_EDITION_BY_AUTHORS, new SearchAuthorsCommand());
        repository.put(CommandName.FIND_EDITION_BY_NUMBER_PAGES, new SearchPagesCommand());
        repository.put(CommandName.FIND_EDITION_BY_PUBLISHING_HOUSE, new SearchHouseCommand());
        repository.put(CommandName.FIND_EDITION_BY_DATE, new SearchDateCommand());
        repository.put(CommandName.FIND_EDITION_BEFORE_DATE, new SearchBeforeDateCommand());
        repository.put(CommandName.FIND_EDITION_BY_ID, new SearchIdCommand());
        repository.put(CommandName.FIND_EDITION_INTERVAL_ID, new SearchIntervalCommand());
        repository.put(CommandName.FIND_EDITION_BY_TYPE, new SearchTypeCommand());
        repository.put(CommandName.SET_EDITION_FROM_FILES, new SetEditionCommand());
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
