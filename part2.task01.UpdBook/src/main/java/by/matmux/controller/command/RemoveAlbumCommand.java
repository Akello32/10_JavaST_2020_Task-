package by.matmux.controller.command;

import by.matmux.beans.Album;
import by.matmux.beans.Edition;
import by.matmux.service.ServiceFactory;
import by.matmux.view.Consumer;

public class RemoveAlbumCommand implements Command{
    @Override
    public Object execute(Consumer consumer) {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        Edition edition = new Album(consumer.enterTitle(), consumer.enterAuthors(), consumer.enterNumberPages(),
                consumer.enterPublishingHouse(), consumer.enterDate(), consumer.enterType());
        return serviceFactory.getRemoveEdition().remove(edition);
    }
}
