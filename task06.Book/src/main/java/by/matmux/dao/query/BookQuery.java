package by.matmux.dao.query;

import by.matmux.beans.Book;

import java.util.ArrayList;
import java.util.Set;

public interface BookQuery {
    ArrayList<Book> query(Set<Book> storage);
}
