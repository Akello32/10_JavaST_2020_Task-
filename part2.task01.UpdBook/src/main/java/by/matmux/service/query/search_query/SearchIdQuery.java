package by.matmux.service.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchIdQuery implements EditionQuery {
    /** Stores the passed book id to be searched for */
    private int id;

    /** Constructor which assigns list of authors to search for
         * @param id - the book id
     */
    public SearchIdQuery(final int id) {
        this.id = id;
    }

    /**
     * Implementation of edition search by id
     * @param storage - the storage of editions
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (id == b.getId()) {
                result.add(b);
            }
        }
        return result;
    }
}
