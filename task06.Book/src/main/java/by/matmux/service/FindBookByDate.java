package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchDateQuery;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FindBookByDate {
    /**
     * Finds books by date of publishing
     * @param date - params to finds
     * @return ArrayList with desired books
     */
    public List<Book> find(final Date date) {
        if (date == null) { return Collections.emptyList(); }
        if (date.after(new Date())) { return Collections.emptyList(); }

        BookRepository repository = BookRepository.getInstance();
        SearchDateQuery dateQuery = new SearchDateQuery(date);
        return repository.query(dateQuery);
    }
}
