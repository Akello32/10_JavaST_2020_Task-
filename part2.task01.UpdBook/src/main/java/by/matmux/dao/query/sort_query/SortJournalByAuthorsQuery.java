package by.matmux.dao.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.beans.Journal;
import by.matmux.dao.query.EditionQuery;
import by.matmux.dao.query.search_query.SearchAllEditionByType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortJournalByAuthorsQuery implements EditionQuery {
    /**
     * Implementation of sorting of the journals by authors
     * @param storage - edition storage
     * @return ArrayList with sorted editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        SearchAllEditionByType search = new SearchAllEditionByType("Journal");
        result.addAll(search.query(storage));
        Comparator<Edition> comparator = Comparator.comparing(e -> e.getAuthors().get(0));
        result.sort(comparator);

        return result;
    }
}
