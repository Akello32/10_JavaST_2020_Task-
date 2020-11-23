package by.matmux.controller.Command;

import by.matmux.bean.TextComposite;
import by.matmux.service.ServiceFactory;

public class ParagraphQueryCommand implements Command{
    @Override
    public String execute(final TextComposite composite) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getParagraphQuery().sort(composite);
    }
}
