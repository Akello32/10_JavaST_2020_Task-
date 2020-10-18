package by.matmux.dao.query.sort_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortPagesQuery implements BookQuery {
    /**
     * Implementation of sorting the repository of books by number of pages
     * @param storage - book storage
     * @return ArrayList with sorted books
     */
    @Override
    public ArrayList<Book> query(final Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>(storage);
        Comparator<Book> comparator = Comparator.comparing(Book::getNumberOfPage);
        result.sort(comparator);
        return result;
    }
}
