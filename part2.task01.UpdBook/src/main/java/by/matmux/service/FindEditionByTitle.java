package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.service.query.search_query.SearchTitleQuery;

import java.util.Collections;
import java.util.List;

public class FindEditionByTitle {
    /**
     * Finds books by title
     * @param title - params to finds
     * @return ArrayList with desired books
     */
    public List<Edition> find(final String title) {
        if (title == null) { return Collections.emptyList(); }
        if (title.equals("")) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchTitleQuery titleQuery = new SearchTitleQuery(title);
        return repository.query(titleQuery);
    }
}
