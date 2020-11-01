package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;

public class RemoveEdition {
    /**
     * Checks parameters and remove editions from the repository
     * @param edition editions to remove
     */
    public String remove(final Edition edition) {
        if (edition != null) {
            EditionRepository repository = EditionRepository.getInstance();
            if (!repository.contains(edition)) {
                repository.addEdition(edition);
            }
        }
        return "book remove";
    }
}

