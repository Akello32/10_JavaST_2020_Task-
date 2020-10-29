package by.matmux.service;

import by.matmux.beans.Edition;
import by.matmux.dao.EditionRepository;

import java.util.Random;

public class AddEdition {
    /**
     * Checks parameters and adds edition in the repository
     * @param edition - edition to add
     */
    public String add(final Edition edition) {
        if (edition != null) {
            EditionRepository repository = EditionRepository.getInstance();
            if (!repository.contains(edition)) {
                edition.setId(new Random().nextInt(2147483647));
                repository.addEdition(edition);
            }
        }
        return "Book adds";
    }
}
