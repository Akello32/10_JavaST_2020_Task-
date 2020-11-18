package by.matmux.dao;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;

public interface Repository {
    void addBook(Book book);
    void removeBook(Book book);
    ArrayList<Book> query(final BookQuery query);
    boolean contains(Book book);
}
