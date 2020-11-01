package by.matmux.service.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventManager {
    /**
     * Singleton object
     */
    private static final EventManager instance = new EventManager();

    /**
     * Stores the listeners
     */
    private List<EditionObserver> observers = new ArrayList<>();

    private EventManager() {}

    /** Subscribes to an listening */
    public void subscribe() {
        observers.addAll(Arrays.asList(new AlbumListener(), new BookListener(), new JournalListener()));
    }

    /** Unsubscribes to an listening */
    public void unsubscribe() {
        observers.clear();
    }

    /**
     * Gets instance object
     * @return instance
     */
    public static EventManager getInstance() {
        return instance;
    }

    /**
     * Returns list of listeners
     * @return observers
     */
    public List<EditionObserver> getObservers() {
        return observers;
    }
}
