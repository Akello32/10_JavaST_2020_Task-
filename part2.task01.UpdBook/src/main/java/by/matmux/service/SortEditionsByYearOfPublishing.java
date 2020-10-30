package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.service.query.sort_query.SortYearQuery;

import java.util.Collections;
import java.util.List;

public class SortEditionsByYearOfPublishing {
    /**
     * Sorts books by year of publishing
     * @return ArrayList with desired books
     */
    public List<Edition> sort() {
        EditionRepository repository = EditionRepository.getInstance();
        if (repository.isEmpty()) { return Collections.emptyList(); }
        return repository.query(new SortYearQuery());
    }
}
