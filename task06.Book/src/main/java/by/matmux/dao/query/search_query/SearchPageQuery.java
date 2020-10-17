package by.matmux.dao.query.search_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchPageQuery implements BookQuery {
    /**
     * Stores the passed number of page to search for
     */
    private int numberOfPages;

    /**
     * Constructor which assigns number of pages to search for
     * @param pages - number of pages
     */
    public SearchPageQuery(final int pages) {
        this.numberOfPages = pages;
    }

    /**
     * Implementation of book search bu number of pages
     * @param storage - the storage of books
     * @return ArrayList with desired books
     */
    @Override
    public ArrayList<Book> query(Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : storage) {
            if (b.getNumberOfPage() == numberOfPages) {
                result.add(b);
            }
        }
        return result;
    }
}
