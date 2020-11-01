package by.matmux.service.observer;

import java.util.*;

public class BookListener implements EditionObserver {
    /** Stores object for listened */
    Map<Integer, Integer> listener = new HashMap<>();

    /** Store date */
    Calendar calendar = new GregorianCalendar();

    /**
     * Updates the information about albums in storage
     * @param date - the date of publishing
     */
    @Override
    public void update(Date date) {
        if (date == null) { return; }
        calendar.setTime(date);
        if (listener.containsKey(calendar.get(Calendar.YEAR))) {
            listener.replace(calendar.get(Calendar.YEAR), listener.get(calendar.get(Calendar.YEAR)) + 1);
        } else {
            listener.put(calendar.get(Calendar.YEAR), 1);
        }
    }

    @Override
    public String toString() {
        return "BookListener: " +
                "listener=" + listener +
                ';';
    }
}
