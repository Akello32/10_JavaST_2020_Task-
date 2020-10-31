package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchInIntervalID;
import by.matmux.dao.query.search_query.SearchPageQuery;

import java.util.Collections;
import java.util.List;

public class FindEditionByIdInterval {
    /**
     * Finds editions by number of pages
     * @param idFirst - left border of the interval
     * @param idSecond - right border of the interval
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final int idFirst, final int idSecond) {
        if (idFirst == 0 || idSecond == 0) { return Collections.emptyList(); }
        if (idFirst + idSecond < 0) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchInIntervalID search = new SearchInIntervalID(idFirst, idSecond);
        return repository.query(search);
    }
}
