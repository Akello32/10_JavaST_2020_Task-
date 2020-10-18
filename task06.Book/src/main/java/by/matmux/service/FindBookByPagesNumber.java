package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchPageQuery;

import java.util.Collections;
import java.util.List;

public class FindBookByPagesNumber {
    /**
     * Finds books by number of pages
     * @param pages - params to find
     * @return ArrayList with desired books
     */
    public List<Book> find(final int pages) {
        if (pages == 0) { return Collections.emptyList(); }

        BookRepository repository = BookRepository.getInstance();
        SearchPageQuery pageQuery = new SearchPageQuery(pages);
        return repository.query(pageQuery);
    }
}
