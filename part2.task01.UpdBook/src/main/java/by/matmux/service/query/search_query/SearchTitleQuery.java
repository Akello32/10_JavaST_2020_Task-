package by.matmux.service.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchTitleQuery implements EditionQuery {
    /** Stores the passed title to be searched for */
    private String title;

    /** Constructor which assigns title to search for
     * @param title - the title of edition
     */
    public SearchTitleQuery(final String title) {
        this.title = title;
    }

    /** Implementation of edition search by title
     * @param storage of edition
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(final Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getTitle().equals(title)) {
                result.add(b);
            }
        }
        return result;
    }
}
