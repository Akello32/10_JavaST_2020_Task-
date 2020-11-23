package by.matmux.controller;

import by.matmux.view.Consumer;

public class Runner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Consumer consumer = new Consumer();
        String request;
        boolean choice = true;
        while (choice) {
            request = consumer.setRequest();
            consumer.show(controller.execute(request));
            if (request.equals("EXIT")) {
                choice = false;
            }
        }
    }
}