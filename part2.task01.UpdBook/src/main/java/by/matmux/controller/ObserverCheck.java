package by.matmux.controller;

import by.matmux.service.observer.*;

public class ObserverCheck {
    private EventManager manager = EventManager.getInstance();

    public String showInf() {
        StringBuilder result = new StringBuilder();
        for (EditionObserver ed : manager.getObservers()) {
            result.append(ed.toString() + "\n");
        }
        return result.toString();
    }
}
