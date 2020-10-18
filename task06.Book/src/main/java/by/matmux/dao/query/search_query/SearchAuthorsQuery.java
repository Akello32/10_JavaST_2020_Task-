package by.matmux.dao.query.search_query;

import by.matmux.beans.Book;
import by.matmux.dao.query.BookQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchAuthorsQuery implements BookQuery {
    /** Stores the passed list of authors to be searched for */
    private ArrayList<String> listAuthors = new ArrayList<>();

    /** Constructor which assigns list of authors to search for
     * @param list - the list of authors
     */
    public SearchAuthorsQuery(final List<String> list) {
        this.listAuthors.addAll(list);
    }

    /**
     * Implementation of book search by authors
     * @param storage - the storage of books
     * @return ArrayList with desired books
     */
    @Override
    public ArrayList<Book> query(Set<Book> storage) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : storage) {
            if (listAuthors.equals(b.getAuthors())) {
                result.add(b);
            }
        }
        return result;
    }
}
