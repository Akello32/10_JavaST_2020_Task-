package by.matmux.service.find_edition;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;
import by.matmux.dao.query.search_query.SearchAllEditionByType;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindEditionByType {
    /**
     * Finds edition by type
     * @param type - the type of edition
     * @return - return list of desired edition
     */
    public List<Edition> find(String type) {
        Optional<String> optionalType = Optional.ofNullable(type);
        SearchAllEditionByType search = new SearchAllEditionByType(optionalType.orElse("Book"));
        if (type.equals(" ")) { return Collections.emptyList(); }

        EditionRepository repository = EditionRepository.getInstance();
        return repository.query(search);
    }
}
