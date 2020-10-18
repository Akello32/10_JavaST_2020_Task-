package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;

public class AddBook {
    /**
     * Checks parameters and adds book in the repository
     * @param book - book to add
     */
    public void add(final Book book) {
        if (book != null) {
            BookRepository repository = BookRepository.getInstance();
            if (!repository.contains(book)) {
                repository.addBook(book);
            }
        }
    }
}
