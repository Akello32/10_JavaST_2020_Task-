package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchDateQuery;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FindEditionByDate {
    /**
     * Finds editions by date of publishing
     * @param date - params to finds
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final Date date) {
        if (date == null) { return Collections.emptyList(); }
        if (date.after(new Date())) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        SearchDateQuery dateQuery = new SearchDateQuery(date);
        return repository.query(dateQuery);
    }
}
