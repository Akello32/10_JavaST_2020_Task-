package by.matmux.dao;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;

public interface Repository{
    void addEdition(Edition edition);
    void removeEdition(Edition edition);
    ArrayList<Edition> query(final EditionQuery query);
    boolean contains(Edition edition);
}
