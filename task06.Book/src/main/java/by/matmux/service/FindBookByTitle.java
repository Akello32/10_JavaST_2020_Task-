package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchTitleQuery;

import java.util.Collections;
import java.util.List;

public class FindBookByTitle {
    /**
     * Finds books by title
     * @param title - params to finds
     * @return ArrayList with desired books
     */
    public List<Book> find(final String title) {
        if (title == null) { return Collections.emptyList(); }
        if (title.equals("")) { return Collections.emptyList(); }

        BookRepository repository = BookRepository.getInstance();
        SearchTitleQuery titleQuery = new SearchTitleQuery(title);
        return repository.query(titleQuery);
    }
}
