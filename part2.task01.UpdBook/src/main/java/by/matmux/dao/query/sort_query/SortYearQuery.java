package by.matmux.dao.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortYearQuery implements EditionQuery {
    /**
     * Implementation of sorting the repository of books by year of publishing
     * @param storage - book storage
     * @return ArrayList with sorted books
     */
    @Override
    public ArrayList<Edition> query(final Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>(storage);
        Comparator<Edition> comparator = Comparator.comparing(Edition::getYearOfPublishing);
        result.sort(comparator);
        return result;
    }
}
