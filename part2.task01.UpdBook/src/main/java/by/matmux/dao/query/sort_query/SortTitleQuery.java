package by.matmux.dao.query.sort_query;

import by.matmux.beans.Book;
import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class SortTitleQuery implements EditionQuery {
    /**
     * Implementation of sorting the repository of books by name
     * @param storage - book storage
     * @return ArrayList with sorted books
     */
    @Override
    public ArrayList<Edition> query(final Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>(storage);
        Comparator<Edition> comparator = Comparator.comparing(Edition::getTitle);
        result.sort(comparator);
        return result;
    }
}
