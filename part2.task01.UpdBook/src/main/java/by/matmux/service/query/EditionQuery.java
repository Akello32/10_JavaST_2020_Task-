package by.matmux.service.query;

import by.matmux.beans.Edition;

import java.util.ArrayList;
import java.util.Set;

public interface EditionQuery {
    ArrayList<Edition> query(Set<Edition> storage);
}
