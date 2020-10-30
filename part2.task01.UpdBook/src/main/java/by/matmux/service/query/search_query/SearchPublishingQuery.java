package by.matmux.service.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchPublishingQuery implements EditionQuery {
    /** Stores the passed publishing house to be searched for */
    private String publishingHouse;

    /** Constructor which assigns publishing house to search for
     * @param publishingHouse - the publishingHouse
     */
    public SearchPublishingQuery(final String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    /** Implementation of edition search by publishing house
     * @param storage of edition
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (b.getPublishingHouse().equals(publishingHouse)) {
                result.add(b);
            }
        }
        return result;
    }
}
