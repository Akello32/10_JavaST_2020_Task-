package by.matmux.controller.Command;

import by.matmux.bean.TextComposite;
import by.matmux.service.ServiceFactory;

public class LexemeQueryCommand implements Command{
    @Override
    public String execute(final TextComposite composite) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getLexemeQuery().sort(composite);
    }
}
