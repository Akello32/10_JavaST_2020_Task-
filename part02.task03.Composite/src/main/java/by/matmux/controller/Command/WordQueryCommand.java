package by.matmux.controller.Command;

import by.matmux.bean.TextComposite;
import by.matmux.service.ServiceFactory;

public class WordQueryCommand implements Command{
    @Override
    public String execute(final TextComposite composite) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getWordQuery().sort(composite);
    }
}
