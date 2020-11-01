package by.matmux.service;

import by.matmux.dao.EditionRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateEdition {
    public String update(final int id, final String updateParams) {
        if (updateParams == null || updateParams.equals("") || id < 0 || id == 0) { return " "; }

        EditionRepository repository = EditionRepository.getInstance();
        ArrayList<String> paramsList = new ArrayList<>();
        String[] arrParams = updateParams.trim().split("= ");

        if (arrParams.length == 2) {
            if (arrParams[0].trim().equals("authors")) {
                paramsList.add(arrParams[0]);
                paramsList.addAll(Arrays.asList(arrParams[1].split(", ")));
                repository.update(id, paramsList);
            }
            paramsList.add(arrParams[0].trim());
            paramsList.add(arrParams[1].trim());
            repository.update(id, paramsList);
            return "Edition update";
        }
        return "Edition update";
    }
}
