package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class MistakeChangeCommand implements Command {
    @Override
    public String execute(final String text, final Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();

        return serviceFactory.getMistakeChange().changingAnMistake(consumer.enterWord(), consumer.enterChar(), consumer.enterChar(), text);
    }
}
