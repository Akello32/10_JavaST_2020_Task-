package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.sort_query.SortTitleQuery;

import java.util.Collections;
import java.util.List;

public class SortEditionsByTitle {
    /**
     * Sorts editions by title
     * @return ArrayList with desired editions
     */
    public List<Edition> sort() {
        EditionRepository repository = EditionRepository.getInstance();
        if (repository.isEmpty()) { return Collections.emptyList(); }
        return repository.query(new SortTitleQuery());
    }
}
