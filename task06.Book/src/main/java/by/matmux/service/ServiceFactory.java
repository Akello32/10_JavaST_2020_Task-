package by.matmux.service;

public final class ServiceFactory {
    private static final ServiceFactory serviceFactory = new ServiceFactory();

    private final AddBook addBook = new AddBook();
    private final RemoveBook removeBook = new RemoveBook();

    private final SetBooksFromFile setBooksFromFile = new SetBooksFromFile();

    private final FindBookByDate findBookByDate = new FindBookByDate();
    private final FindBookByAuthors findBookByAuthors = new FindBookByAuthors();
    private final FindBookByPagesNumber findBookByPagesNumber = new FindBookByPagesNumber();
    private final FindBookByPublishingHouse publishingHouse = new FindBookByPublishingHouse();
    private final FindBookByTitle findBookByTitle = new FindBookByTitle();

    private final SortBookByAuthors sortBookByAuthors = new SortBookByAuthors();
    private final SortBookByPagesNumber sortBookByPagesNumber = new SortBookByPagesNumber();
    private final SortBookByTitle sortBookByTitle = new SortBookByTitle();
    private final SortBookByPublishingHouse bookByPublishingHouse = new SortBookByPublishingHouse();
    private final SortBookByYearOfPublishing yearOfPublishing = new SortBookByYearOfPublishing();

    public static ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public AddBook getAddBook() {
        return addBook;
    }

    public RemoveBook getRemoveBook() {
        return removeBook;
    }

    public FindBookByDate getFindBookByDate() {
        return findBookByDate;
    }

    public FindBookByAuthors getFindBookByAuthors() {
        return findBookByAuthors;
    }

    public FindBookByPagesNumber getFindBookByPagesNumber() {
        return findBookByPagesNumber;
    }

    public FindBookByPublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public FindBookByTitle getFindBookByTitle() {
        return findBookByTitle;
    }

    public SetBooksFromFile getSetBooksFromFile() { return setBooksFromFile; }

    public SortBookByAuthors getSortBookByAuthors() {
        return sortBookByAuthors;
    }

    public SortBookByPagesNumber getSortBookByPagesNumber() {
        return sortBookByPagesNumber;
    }

    public SortBookByTitle getSortBookByTitle() {
        return sortBookByTitle;
    }

    public SortBookByPublishingHouse getBookByPublishingHouse() {
        return bookByPublishingHouse;
    }

    public SortBookByYearOfPublishing getYearOfPublishing() {
        return yearOfPublishing;
    }
}
