package by.matmux.controller;

import by.matmux.view.Consumer;

public class Runner {
//    private static final Logger logger = LogManager.getLogger(Runner.class);
    public static void main(String[] args) {
        Controller controller = new Controller();
        Consumer consumer = new Consumer();
        String request = new String();
        boolean choice = true;
        while (choice) {
            request = consumer.setRequest();

        }
    }
}
