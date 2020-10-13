package by.matmux.controller;

import by.matmux.service.*;
import by.matmux.view.Consumer;

public class Runner {
    public static void main(String[] args) {
        final Controller controller = new Controller();
        final Consumer consumer = new Consumer();
        String text = "";
        String selectedCommand;
        boolean choice = true;

        while (choice) {
            selectedCommand = consumer.setRequest();

            if (selectedCommand.equals("SET_TEXT_FROM_CONSOLE")) {
                text = consumer.setTextFromConsole();
                continue;
            }

            if (selectedCommand.equals("SET_TEXT_FROM_FILE")) {
                text = consumer.setTextFromFile();
                continue;
            }

            if (selectedCommand.equals("EXIT")) {
                choice = false;
                continue;
            }

            consumer.show(controller.executeTask(selectedCommand, text, consumer));
        }
    }
}


