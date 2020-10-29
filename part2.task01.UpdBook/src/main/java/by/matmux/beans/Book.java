package by.matmux.beans;

import java.util.*;

public class Book extends Edition{
    public Book(final ArrayList<String> authors, final ArrayList<String> paramsList, final String type) {
        super(authors, paramsList, type);
    }

    public Book(final String title, final ArrayList<String> authors,
                 final int numberOfPage, final String publishingHouse, final Date yearOfPublishing) {
        super(title, authors, numberOfPage, publishingHouse, yearOfPublishing);
    }
}
