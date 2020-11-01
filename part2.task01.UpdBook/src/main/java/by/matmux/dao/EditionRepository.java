package by.matmux.dao;

import by.matmux.beans.Edition;
import by.matmux.dao.query.EditionQuery;
import by.matmux.service.observer.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public final class EditionRepository implements Repository {
    /** Singleton object */
    private static final EditionRepository instance = new EditionRepository();

    /** Observer object  */
    private EventManager manager = EventManager.getInstance();

    /** Edition store */
    private Set<Edition> editionsSet = new HashSet<>();

    private EditionRepository() {
        manager.subscribe();
    }

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
        selectObserver(edition);
    }

    /**
     * Removes a object of edition from storage
     * @param edition - edition to remove
     */
    @Override
    public void removeEdition(final Edition edition) {
        editionsSet.remove(edition);
        selectObserver(edition);
    }

    /**
     * Implements a request to sort or search for a edition by tag
     * @param query - a query with the passed tag
     * @return ArrayList with a desired editions
     */
    @Override
    public ArrayList<Edition> query(final EditionQuery query) {
        return query.query(editionsSet);
    }

    /**
     * Checks whether the edition is in storage
     * @param edition - edition to check
     * @return check result
     */
    @Override
    public boolean contains(Edition edition) {
        return editionsSet.contains(edition);
    }


    /**
     * Update edition by passed parameter
     * @param id - id of desired edition
     * @param paramList - type and value of parameter
     */
    public void update(final int id, final ArrayList<String> paramList) {
        Edition edition = getEditionById(id);
        if (edition == null) {
            return;
        } else if (paramList.get(0).equals("type")) {
            edition.setType(paramList.get(1));
        } else  if (paramList.get(0).equals("title")) {
            edition.setTitle(paramList.get(1));
        } else  if (paramList.get(0).equals("authors")) {
            paramList.remove(0);
            edition.setAuthors(paramList);
        } else if (paramList.get(0).equals("number of pages")) {
            edition.setNumberOfPage(Integer.parseInt(paramList.get(1)));
        } else if (paramList.get(0).equals("year of publishing")) {
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            try {
                date = format.parse(paramList.get(1));
                edition.setYearOfPublishing(date);
            } catch (ParseException e) {
                return;
            }
        } else if (paramList.get(0).equals("publishing house")) {
            edition.setPublishingHouse(paramList.get(1));
        }
        selectObserver(edition);
    }

    /**
     * Return edition by id
     * @param id - id to find
     * @return returns the required edition, or null if no such ID exists
     */
    public Edition getEditionById(final int id) {
        for (Edition b : editionsSet) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Edition b : editionsSet) {
            result.append(b.toString());
        }
        return result.toString();
    }

    private void selectObserver(final Edition edition) {
        if (edition.getType().equals("Album")) {
            manager.getObservers().get(0).update(edition.getYearOfPublishing());
        } else if (edition.getType().equals("Journal")) {
            manager.getObservers().get(1).update(edition.getYearOfPublishing());
        } else if (edition.getType().equals("Book")) {
            manager.getObservers().get(2).update(edition.getYearOfPublishing());
        }
    }
}