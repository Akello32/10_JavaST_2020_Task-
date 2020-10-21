package by.matmux.dao.query.search_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class SearchDateQuery implements BookQuery {
    /** Stores the passed year of publishing to be searched for */
    private Date yearOfPublishing;

    /**
     *  Constructor which assigns year of publishing to search for
     * @param date - the year of publishing
     */
    public SearchDateQuery(final Date date) {
        this.yearOfPublishing = date;
    }

    @Override
    public ArrayList<Book> query(Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : storage) {
            if (b.getYearOfPublishing().equals(yearOfPublishing)) {
                result.add(b);
            }
        }
        return result;
    }
}
