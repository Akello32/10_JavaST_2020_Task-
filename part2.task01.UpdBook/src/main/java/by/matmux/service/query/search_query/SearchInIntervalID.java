package by.matmux.service.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchInIntervalID implements EditionQuery {
    /** Stores the first id to be searched for */
    private int idFirst;
    /** Stores the second id to be searched for */
    private int idSecond;

    /** Constructor which assigns list of authors to search for
     * @param idFirst - the first book id
     * @param idSecond - the second book id
     */
    public SearchInIntervalID(final int idFirst, final int idSecond) {
        this.idFirst = idFirst;
        this.idSecond = idSecond;
    }

    /**
     * Implementation of edition search by id interval
     * @param storage - the storage of editions
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getId() < idSecond && b.getId() > idFirst) {
                result.add(b);
            }
        }
        return result;
    }
}
