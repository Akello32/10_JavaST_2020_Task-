package by.matmux.service.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortAuthorsQuery implements EditionQuery {
    /**
     * Implementation of sorting the repository of editions by authors
     * @param storage - edition storage
     * @return ArrayList with sorted editions
     */
    @Override
    public ArrayList<Edition> query(final Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>(storage);
        Comparator<Edition> comparator = Comparator.comparing(s -> s.getAuthors().get(0));
        result.sort(comparator);
        return result;
    }
}
