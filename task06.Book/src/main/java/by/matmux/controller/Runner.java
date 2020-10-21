package by.matmux.controller;

import by.matmux.dao.BookRepository;
import by.matmux.view.Consumer;

public class Runner {
//    private static final Logger logger = LogManager.getLogger(Runner.class);
    public static void main(String[] args) {
        Controller controller = new Controller();
        Consumer consumer = new Consumer();
        String request;
        boolean choice = true;
        while (choice) {
            request = consumer.setRequest();
            consumer.show(controller.execute(request, consumer).toString());
/*            consumer.show(BookRepository.getInstance().toString());*/
            if (request.equals("EXIT")) {
                choice = false;
            }
        }
    }
}
