package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;

public class RemoveBook {
    /**
     * Checks parameters and remove book from the repository
     * @param book book to remove
     */
    public void remove(final Book book) {
        if (book != null) {
            BookRepository repository = BookRepository.getInstance();
            if (!repository.contains(book)) {
                repository.addBook(book);
            }
        }
    }
}

