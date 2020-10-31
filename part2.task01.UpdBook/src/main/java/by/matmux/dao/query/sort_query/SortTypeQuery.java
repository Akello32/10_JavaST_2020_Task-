package by.matmux.dao.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortTypeQuery implements EditionQuery {
    /**
     * Implementation of sorting the repository of editions by publishing house
     * @param storage - edition storage
     * @return ArrayList with sorted editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        Comparator<Edition> comparator = Comparator.comparing(Edition::getType);
        result.sort(comparator);
        return result;
    }
}
