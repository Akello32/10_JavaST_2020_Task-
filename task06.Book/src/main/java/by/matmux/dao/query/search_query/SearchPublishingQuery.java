package by.matmux.dao.query.search_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchPublishingQuery implements BookQuery {
    /** Stores the passed publishing house to be searched for */
    private String publishingHouse;

    /** Constructor which assigns publishing house to search for
     * @param publishingHouse - the publishingHouse
     */
    public SearchPublishingQuery(final String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    /** Implementation of book search by publishing house
     * @param storage of book
     * @return ArrayList with desired books
     */
    @Override
    public ArrayList<Book> query(Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : storage) {
            if (b.getPublishingHouse().equals(publishingHouse)) {
                result.add(b);
            }
        }
        return result;
    }
}
