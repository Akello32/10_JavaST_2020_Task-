package by.matmux.dao.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class SearchBeforeDateQuery implements EditionQuery {
    /** Stores the passed date to be searched for */
    private Date date;

    /**
     *  Constructor which assigns date for
     * @param date - max data
     */
    public SearchBeforeDateQuery(final Date date) {
        this.date = date;
    }

    /**
     * Implementation of edition search by passed date
     * @param storage - the storage of edition
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getYearOfPublishing().before(date)) {
                result.add(b);
            }
        }
        return result;
    }
}
