package by.matmux.service;

import by.matmux.service.find_edition.*;
import by.matmux.service.sort_edition.*;

public final class ServiceFactory {
    private static final ServiceFactory serviceFactory = new ServiceFactory();

    private final AddEdition addEdition = new AddEdition();
    private final RemoveEdition removeEdition = new RemoveEdition();
    private final UpdateEdition updateEdition = new UpdateEdition();

    private final SetEditionsFromFile setEditionsFromFile = new SetEditionsFromFile();

    private final FindEditionByDate findEditionByDate = new FindEditionByDate();
    private final FindEditionByAuthors findEditionByAuthors = new FindEditionByAuthors();
    private final FindEditionByPagesNumber findEditionByPagesNumber = new FindEditionByPagesNumber();
    private final FindEditionByPublishingHouse publishingHouse = new FindEditionByPublishingHouse();
    private final FindEditionByTitle findEditionByTitle = new FindEditionByTitle();
    private final FindEditionBeforeDate findEditionBeforeDate = new FindEditionBeforeDate();
    private final FindsEditionByID findEditionById = new FindsEditionByID();
    private final FindEditionByIdInterval findEditionByIdInterval = new FindEditionByIdInterval();
    private final FindEditionByType findEditionByType = new FindEditionByType();

    private final SortEditionsByAuthors sortEditionsByAuthors = new SortEditionsByAuthors();
    private final SortEditionsByPagesNumber sortEditionsByPagesNumber = new SortEditionsByPagesNumber();
    private final SortEditionsByTitle sortEditionsByTitle = new SortEditionsByTitle();
    private final SortEditionsByPublishingHouse editionsByPublishingHouse = new SortEditionsByPublishingHouse();
    private final SortEditionsByYearOfPublishing yearOfPublishing = new SortEditionsByYearOfPublishing();
    private final SortAlbumByTitle sortAlbumByTitle = new SortAlbumByTitle();
    private final SortBookByPages sortBookByPages = new SortBookByPages();
    private final SortJournalByAuthors sortJournalByAuthors = new SortJournalByAuthors();

    public static ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public AddEdition getAddEdition() {
        return addEdition;
    }

    public RemoveEdition getRemoveEdition() {
        return removeEdition;
    }

    public UpdateEdition getUpdateEdition() {
        return updateEdition;
    }

    public SetEditionsFromFile getSetEditionsFromFile() {
        return setEditionsFromFile;
    }

    public FindEditionByDate getFindEditionByDate() {
        return findEditionByDate;
    }

    public FindEditionByAuthors getFindEditionByAuthors() {
        return findEditionByAuthors;
    }

    public FindEditionByPagesNumber getFindEditionByPagesNumber() {
        return findEditionByPagesNumber;
    }

    public FindEditionByPublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public FindEditionByTitle getFindEditionByTitle() {
        return findEditionByTitle;
    }

    public FindEditionBeforeDate getFindEditionBeforeDate() {
        return findEditionBeforeDate;
    }

    public FindsEditionByID getFindEditionById() {
        return findEditionById;
    }

    public FindEditionByIdInterval getFindEditionByIdInterval() {
        return findEditionByIdInterval;
    }

    public FindEditionByType getFindEditionByType() {
        return findEditionByType;
    }

    public SortAlbumByTitle getSortAlbumByTitle() {
        return sortAlbumByTitle;
    }

    public SortBookByPages getSortBookByPages() {
        return sortBookByPages;
    }

    public SortJournalByAuthors getSortJournalByAuthors() {
        return sortJournalByAuthors;
    }

    public SortEditionsByAuthors getSortEditionsByAuthors() {
        return sortEditionsByAuthors;
    }

    public SortEditionsByPagesNumber getSortEditionsByPagesNumber() {
        return sortEditionsByPagesNumber;
    }

    public SortEditionsByTitle getSortEditionsByTitle() {
        return sortEditionsByTitle;
    }

    public SortEditionsByPublishingHouse getEditionsByPublishingHouse() {
        return editionsByPublishingHouse;
    }

    public SortEditionsByYearOfPublishing getYearOfPublishing() {
        return yearOfPublishing;
    }
}
