package by.matmux.service.query.search_query;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.Set;

public class SearchAllEditionByType implements EditionQuery {
    private String type;

    public SearchAllEditionByType(final String type) { this.type = type; }

    @Override
    public ArrayList<Edition> query(Set<Edition> storage) {
        ArrayList<Edition> result = new ArrayList<>();
        for (Edition ed : storage) {
            if (ed.getType().equals(type)) { result.add(ed); }
        }
        return result;
    }
}
