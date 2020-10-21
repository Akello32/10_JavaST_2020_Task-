package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.sort_query.SortPagesQuery;

import java.util.Collections;
import java.util.List;

public class SortBookByPagesNumber {
    /**
     * Sorts books by pages of number
     * @return ArrayList with desired books
     */
    public List<Book> sort() {
        BookRepository repository = BookRepository.getInstance();
        if (repository.isEmpty()) { return Collections.emptyList(); }
        return repository.query(new SortPagesQuery());
    }
}
