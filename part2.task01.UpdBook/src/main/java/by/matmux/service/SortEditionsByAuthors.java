package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.service.query.sort_query.SortAuthorsQuery;

import java.util.Collections;
import java.util.List;

public class SortEditionsByAuthors {
    /**
     * Sorts editions by authors
     * @return ArrayList with desired editions
     */
    public List<Edition> sort() {
        EditionRepository repository = EditionRepository.getInstance();
        if (repository.isEmpty()) { return Collections.emptyList(); }
        return repository.query(new SortAuthorsQuery());
    }
}
