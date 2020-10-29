package by.matmux.dao.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchAuthorsQuery implements EditionQuery {
    /** Stores the passed list of authors to be searched for */
    private ArrayList<String> listAuthors = new ArrayList<>();

    /** Constructor which assigns list of authors to search for
     * @param list - the list of authors
     */
    public SearchAuthorsQuery(final List<String> list) {
        this.listAuthors.addAll(list);
    }

    /**
     * Implementation of edition search by authors
     * @param storage - the storage of editions
     * @return ArrayList with desired editions
     */
    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition b : storage) {
            if (listAuthors.equals(b.getAuthors())) {
                result.add(b);
            }
        }
        return result;
    }
}
