package by.matmux.beans;

import java.util.*;

public class Book extends Edition{
    public Book(final ArrayList<String> authors, final ArrayList<String> paramsList) {
        super(authors, paramsList);
    }

    public Book(final String title, final ArrayList<String> authors,
                 final int numberOfPage, final String publishingHouse, final Date yearOfPublishing, final String type) {
        super(title, authors, numberOfPage, publishingHouse, yearOfPublishing, type);
    }
}
