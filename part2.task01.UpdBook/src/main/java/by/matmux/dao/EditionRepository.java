package by.matmux.dao;

import by.matmux.beans.Edition;
import by.matmux.service.query.EditionQuery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class EditionRepository implements Repository {
    /** Singleton object */
    private static final EditionRepository instance = new EditionRepository();

    /** Edition store */
    private Set<Edition> editionsSet = new HashSet<>();

    private EditionRepository() {}

    /**
     * getting a instance object
     * @return a instance object
     */
    public static EditionRepository getInstance() {
        return instance;
    }

    /**
     * checks whether the collection is empty
     * @return checks result
     */
    public boolean isEmpty() {
        return editionsSet.isEmpty();
    }

    /**
     * Adds object of edition in the storage
     * @param edition - edition to add
     */
    @Override
    public void addEdition(final Edition edition) {
        editionsSet.add(edition);
    }

    /**
     * Removes a object of edition from storage
     * @param edition - edition to remove
     */
    @Override
    public void removeEdition(final Edition edition) {
        editionsSet.remove(edition);
    }

    /**
     * Implements a request to sort or search for a book by tag
     * @param query - a query with the passed tag
     * @return ArrayList with a desired books
     */
    @Override
    public ArrayList<Edition> query(final EditionQuery query) {
        return query.query(editionsSet);
    }

    /**
     * Checks whether the book is in storage
     * @param edition - book to check
     * @return check result
     */
    @Override
    public boolean contains(Edition edition) {
        return editionsSet.contains(edition);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Edition b : editionsSet) {
            result.append(b.toString());
        }
        return result.toString();
    }
}