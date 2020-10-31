package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchPublishingQuery;

import java.util.Collections;
import java.util.List;

public class FindEditionByPublishingHouse {
    /**
     * Finds editions by publishing house
     * @param publishingHouse - params to finds
     * @return ArrayList with desired editions
     */
    public List<Edition> find(String publishingHouse) {
        if (publishingHouse == null) { return Collections.emptyList(); }
        if (publishingHouse.equals(" ")) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchPublishingQuery publishingQuery = new SearchPublishingQuery(publishingHouse);
        return repository.query(publishingQuery);
    }
}
