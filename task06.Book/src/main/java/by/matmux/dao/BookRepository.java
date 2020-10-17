package by.matmux.dao;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BookRepository implements Repository {
    private Set<Book> bookSet = new HashSet<>();

    @Override
    public void addBook(Book book) {
        bookSet.add(book);
    }

    @Override
    public void removeBook(Book book) {
        bookSet.remove(book);
    }

    @Override
    public ArrayList<Book> findByTag(BookQuery query) {
        return null;
    }

    @Override
    public String sortBooksByTag(BookQuery query) {
        return null;
    }
}
