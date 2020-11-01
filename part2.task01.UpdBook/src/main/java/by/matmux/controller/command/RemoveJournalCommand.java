package by.matmux.controller.command;

import by.matmux.beans.Edition;
import by.matmux.beans.Journal;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class RemoveJournalCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        Edition edition = new Journal(consumer.enterTitle(), consumer.enterAuthors(), consumer.enterNumberPages(),
                consumer.enterPublishingHouse(), consumer.enterDate(), consumer.enterType());
        return serviceFactory.getRemoveEdition().remove(edition);
    }
}
