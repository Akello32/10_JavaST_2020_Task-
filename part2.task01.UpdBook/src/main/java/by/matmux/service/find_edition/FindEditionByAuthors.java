package by.matmux.service.find_edition;


import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchAuthorsQuery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindEditionByAuthors {
    /**
     * Finds editions by authors
     * @param authors - params to find
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final ArrayList<String> authors) {
        if (authors.contains(null) || authors.contains("")) {
            return Collections.emptyList();
        }

        EditionRepository repository = EditionRepository.getInstance();
        SearchAuthorsQuery authorsQuery = new SearchAuthorsQuery(authors);
        return repository.query(authorsQuery);
    }
}
