package by.matmux.controller;

import by.matmux.view.Consumer;

public class Runner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Consumer consumer = new Consumer();
        ObserverCheck observerCheck = new ObserverCheck();
        String request;
        boolean choice = true;
        consumer.showMenu();
        while (choice) {
            request = consumer.setRequest();
            consumer.show(controller.execute(request, consumer).toString());
            consumer.showObserverInf(observerCheck.showInf());
            if (request.equals("EXIT")) {
                choice = false;
            }
        }
    }
}
