package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class SearchIntervalCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        return serviceFactory.getFindEditionByIdInterval().find(consumer.enterId(), consumer.enterId());
    }
}
