package by.matmux.controller.command;

import by.matmux.beans.Book;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class SortTitleCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        return serviceFactory.getSortBookByTitle().sort();
    }
}
