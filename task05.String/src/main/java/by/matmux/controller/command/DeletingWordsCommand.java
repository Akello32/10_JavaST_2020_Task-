package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class DeletingWordsCommand implements Command {
    @Override
    public String execute(final String text, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();

        return serviceFactory.getDeletingWords().delete(text, consumer.enterNumber());
    }
}
