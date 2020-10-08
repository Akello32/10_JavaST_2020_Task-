package by.matmux.controller;

import by.matmux.controller.command.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandNameArray, Command> repos = new HashMap<>();
    CommandProvider() {
        repos.put(CommandNameArray.ADDITION_ARR, new AdditionArrayCommand());
        repos.put(CommandNameArray.BINARY_SEARCH, new BinarySearchCommand());
        repos.put(CommandNameArray.FIBONACHI, new FibonachiNumbersCommand());
        repos.put(CommandNameArray.FIND_BY_VALUE, new FindByValueCommand());
        repos.put(CommandNameArray.FIND_MAX, new FindMaxCommand());
        repos.put(CommandNameArray.FIND_MIN, new FindMinCommand());
        repos.put(CommandNameArray.FIND_PRIME, new FindPrimeNumberCommand());
        repos.put(CommandNameArray.FIND_THREE_DIGITS, new FindPrimeNumberCommand());
        repos.put(CommandNameArray.MULTIPLICATION, new MultiplicationArrCommand());
        repos.put(CommandNameArray.QUICK_SORT_ARR, new QuickSortCommand());
        repos.put(CommandNameArray.SHELL_SORT, new ShellSortCommand());
        repos.put(CommandNameArray.SHUTTLE_SORT, new ShuttleSortCommand());
        repos.put(CommandNameArray.SORT_MAX_IN_ROW, new SortMaxElemRowComm());
        repos.put(CommandNameArray.SORT_MIN_IN_ROW, new SortMinElemRowComm());
        repos.put(CommandNameArray.SORT_SUM_ROW, new SortSumOfElemRowComm());
        repos.put(CommandNameArray.SET_ARR_RANDOM, new SetArrRandomCommand());
        repos.put(CommandNameArray.SET_ARR_FILES, new SetFormFilesCommand());
        repos.put(CommandNameArray.TRANSPOSITION, new TranspositionArrayCommand());
        repos.put(CommandNameArray.SUBTRACTION, new SubtractionJaggedArrayComm());
        repos.put(CommandNameArray.CHECK_SQUARE, new CheckSquareCommand());
    }

    Command getCommand(String name) {
        CommandNameArray commandName = null;
        Command command = null;
        try {
            commandName = CommandNameArray.valueOf(name.toUpperCase());
            command = repos.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("ERROR");
        }
        return command;
    }
}
