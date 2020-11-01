package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchDateQuery;

import java.util.*;

public class FindEditionBeforeDate {
    /**
     * Finds editions by released before the transmitted date
     * @param date - params to finds
     * @return ArrayList with desired editions
     */
    public List<Edition> find(final Date date) {
        Optional<Date> optionalDate = Optional.ofNullable(date);
        SearchDateQuery dateQuery = new SearchDateQuery(optionalDate.orElse(
                new Date(2020, Calendar.SEPTEMBER, 21)));
        if (date.after(new Date())) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        return repository.query(dateQuery);
    }
}
