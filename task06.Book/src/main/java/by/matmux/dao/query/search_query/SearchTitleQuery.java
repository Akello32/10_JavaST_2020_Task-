package by.matmux.dao.query.search_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchTitleQuery implements BookQuery {
    /** Stores the passed title to be searched for */
    private String title;

    /** Constructor which assigns title to search for
     * @param title - the title of book
     */
    public SearchTitleQuery(final String title) {
        this.title = title;
    }

    /** Implementation of book search by title
     * @param storage of book
     * @return ArrayList with desired books
     */
    @Override
    public ArrayList<Book> query(final Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : storage) {
            if (b.getTitle().equals(title)) {
                result.add(b);
            }
        }
        return result;
    }
}
