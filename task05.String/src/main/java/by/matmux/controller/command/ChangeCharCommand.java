package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class ChangeCharCommand implements Command{
    @Override
    public String execute(final String text, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();

        return serviceFactory.getChangeChar().changeChar(consumer.enterNumber(), consumer.enterChar(), text);
    }
}
