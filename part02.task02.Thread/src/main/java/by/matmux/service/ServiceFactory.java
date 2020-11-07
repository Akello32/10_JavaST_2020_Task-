package by.matmux.service;

import by.matmux.service.calling_thread.CallFirstSolution;

public final class ServiceFactory {
    private final static ServiceFactory instance = new ServiceFactory();

    private final CallFirstSolution firstSolution = new CallFirstSolution();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public CallFirstSolution getFirstSolution() {
        return firstSolution;
    }
}
