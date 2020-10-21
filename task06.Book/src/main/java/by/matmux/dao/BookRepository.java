package by.matmux.dao;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class BookRepository implements Repository {
    /** Singleton object */
    private static final BookRepository instance = new BookRepository();

    /** Book store */
    private Set<Book> bookSet = new HashSet<>();

    private BookRepository() {}

    /**
     * getting a instance object
     * @return a instance object
     */
    public static BookRepository getInstance() {
        return instance;
    }

    /**
     * checks whether the collection is empty
     * @return checks result
     */
    public boolean isEmpty() {
        return bookSet.isEmpty();
    }

    /**
     * Adds book in the storage
     * @param book - book to add
     */
    @Override
    public void addBook(final Book book) {
        bookSet.add(book);
    }

    /**
     * Removes a book from storage
     * @param book - book to remove
     */
    @Override
    public void removeBook(final Book book) {
        bookSet.remove(book);
    }

    /**
     * Implements a request to sort or search for a book by tag
     * @param query - a query with the passed tag
     * @return ArrayList with a desired books
     */
    @Override
    public ArrayList<Book> query(final BookQuery query) {
        return query.query(bookSet);
    }

    /**
     * Checks whether the book is in storage
     * @param book - book to check
     * @return check result
     */
    @Override
    public boolean contains(Book book) {
        return bookSet.contains(book);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book b : bookSet) {
            result.append(b.toString());
        }
        return result.toString();
    }
}
