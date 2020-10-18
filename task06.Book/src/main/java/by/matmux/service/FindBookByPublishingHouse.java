package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchPublishingQuery;
import by.matmux.dao.query.search_query.SearchTitleQuery;

import java.util.Collections;
import java.util.List;

public class FindBookByPublishingHouse {
    /**
     * Finds books by publishing house
     * @param publishingHouse - params to finds
     * @return ArrayList with desired books
     */
    public List<Book> find(String publishingHouse) {
        if (publishingHouse == null) { return Collections.emptyList(); }
        if (publishingHouse.equals("")) { return Collections.emptyList(); }

        BookRepository repository = BookRepository.getInstance();
        SearchPublishingQuery publishingQuery = new SearchPublishingQuery(publishingHouse);
        return repository.query(publishingQuery);
    }
}
