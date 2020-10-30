package by.matmux.beans;

import java.util.ArrayList;
import java.util.Date;

public class Journal extends Edition{
    public Journal(final ArrayList<String> authors, final ArrayList<String> paramsList) {
        super(authors, paramsList);
    }

    public Journal(final String title, final ArrayList<String> authors,
                final int numberOfPage, final String publishingHouse, final Date yearOfPublishing, final String type) {
        super(title, authors, numberOfPage, publishingHouse, yearOfPublishing, type);
    }
}
