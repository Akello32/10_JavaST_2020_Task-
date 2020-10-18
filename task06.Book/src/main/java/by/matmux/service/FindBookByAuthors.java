package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchAuthorsQuery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindBookByAuthors {
    /**
     * Finds book by authors
     * @param authors - params to find
     * @return ArrayList with desired books
     */
    public List<Book> find(final ArrayList<String> authors) {
        if (authors.contains(null) || authors.contains("")) {
            return Collections.emptyList();
        }

        BookRepository repository = BookRepository.getInstance();
        SearchAuthorsQuery authorsQuery = new SearchAuthorsQuery(authors);
        return repository.query(authorsQuery);
    }
}
