package by.matmux.service.sort_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.sort_query.SortAuthorsQuery;

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
