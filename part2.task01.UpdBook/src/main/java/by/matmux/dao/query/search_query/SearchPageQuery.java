package by.matmux.dao.query.search_query;


import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchPageQuery implements EditionQuery {
    /**
     * Stores the passed number of page to search for
     */
    private int numberOfPages;

    /**
     * Constructor which assigns number of pages to search for
     * @param pages - number of pages
     */
    public SearchPageQuery(final int pages) {
        this.numberOfPages = pages;
    }

    /**
     * Implementation of edition search by number of pages
     * @param storage - the storage of edition
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getNumberOfPage() == numberOfPages) {
                result.add(b);
            }
        }
        return result;
    }
}
