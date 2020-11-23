package by.matmux.controller.command;

import by.matmux.service.ServiceFactory;

public class LexemeQueryCommand implements Command{
    @Override
    public String execute() {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getLexemeQuery().sort();
    }
}
