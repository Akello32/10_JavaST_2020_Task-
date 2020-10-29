package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchPageQuery;

import java.util.Collections;
import java.util.List;

public class FindEditionByPagesNumber {
    /**
     * Finds editions by number of pages
     * @param pages - params to find
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final int pages) {
        if (pages == 0) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchPageQuery pageQuery = new SearchPageQuery(pages);
        return repository.query(pageQuery);
    }
}
