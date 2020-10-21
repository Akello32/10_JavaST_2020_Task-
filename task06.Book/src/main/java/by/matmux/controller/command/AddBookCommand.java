package by.matmux.controller.command;

import by.matmux.beans.Book;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class AddBookCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        Book book = new Book(consumer.enterTitle(), consumer.enterAuthors(), consumer.enterNumberPages(),
                consumer.enterPublishingHouse(), consumer.enterDate());
        return serviceFactory.getAddBook().add(book);
    }
}
