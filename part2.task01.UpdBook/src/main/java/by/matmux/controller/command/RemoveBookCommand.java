package by.matmux.controller.command;

import by.matmux.beans.Book;
import by.matmux.beans.Edition;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class RemoveBookCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        Edition edition = new Book(consumer.enterTitle(), consumer.enterAuthors(), consumer.enterNumberPages(),
                consumer.enterPublishingHouse(), consumer.enterDate(), //TODO create a enter type
                consumer.enterTitle());
        return serviceFactory.getRemoveEdition().remove(edition);
    }
}
