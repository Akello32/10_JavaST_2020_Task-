package by.matmux.dao.query.sort_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;
import by.matmux.dao.query.search_query.SearchAllEditionByType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortAlbumByTitleQuery implements EditionQuery {
    /**
     * Implementation of sorting of the journals by authors
     * @param storage - edition storage
     * @return ArrayList with sorted editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        SearchAllEditionByType search = new SearchAllEditionByType("Album");
        result.addAll(search.query(storage));
        Comparator<Edition> comparator = Comparator.comparing(Edition::getTitle);
        result.sort(comparator);

        return result;
    }
}
