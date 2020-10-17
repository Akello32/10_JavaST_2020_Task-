package by.matmux.dao;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Set;

public interface Repository{
    public void addBook(Book book);
    public void removeBook(Book book);
    public ArrayList<Book> findByTag(BookQuery query);
    public String sortBooksByTag(BookQuery query);
}
