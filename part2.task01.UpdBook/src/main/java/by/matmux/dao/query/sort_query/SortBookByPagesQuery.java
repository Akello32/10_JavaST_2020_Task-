package by.matmux.dao.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;
import by.matmux.dao.query.search_query.SearchAllEditionByType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortBookByPagesQuery implements EditionQuery {
    /**
     * Implementation of sorting books by numbers of page
     * @param storage - edition storage
     * @return ArrayList with sorted editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        SearchAllEditionByType search = new SearchAllEditionByType("Book");
        result.addAll(search.query(storage));
        Comparator<Edition> comparator = Comparator.comparing(Edition::getNumberOfPage);
        result.sort(comparator);

        return result;
    }
}
