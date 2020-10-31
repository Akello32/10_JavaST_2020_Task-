package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class SetEditionCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        return serviceFactory.getSetEditionsFromFile().setBooks();
    }
}
