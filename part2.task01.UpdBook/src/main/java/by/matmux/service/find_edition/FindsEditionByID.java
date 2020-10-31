package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchIdQuery;
import by.matmux.dao.query.search_query.SearchPageQuery;

import java.util.Collections;
import java.util.List;

public class FindsEditionByID {
    /**
     * Finds editions by books id
     * @param id - params to find
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final int id) {
        if (id == 0) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchIdQuery searchIdQuery = new SearchIdQuery(id);
        return repository.query(searchIdQuery);
    }
}
