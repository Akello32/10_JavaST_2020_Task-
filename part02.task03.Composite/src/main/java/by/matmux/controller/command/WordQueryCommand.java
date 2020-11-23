package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;

public class WordQueryCommand implements Command{
    @Override
    public String execute() {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getWordQuery().sort();
    }
}
