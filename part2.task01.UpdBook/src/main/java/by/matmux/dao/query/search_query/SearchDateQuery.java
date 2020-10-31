package by.matmux.dao.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class SearchDateQuery implements EditionQuery {
    /** Stores the passed year of publishing to be searched for */
    private Date yearOfPublishing;

    /**
     *  Constructor which assigns year of publishing to search for
     * @param date - the year of publishing
     */
    public SearchDateQuery(final Date date) {
        this.yearOfPublishing = date;
    }

    /**
     * Implementation of edition search by date of publishing
     * @param storage - the storage of edition
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getYearOfPublishing().equals(yearOfPublishing)) {
                result.add(b);
            }
        }
        return result;
    }
}
