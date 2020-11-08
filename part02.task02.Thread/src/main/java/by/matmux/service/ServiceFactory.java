package by.matmux.service;

import by.matmux.service.first_solution.CallFirstSolution;
import by.matmux.service.fourth_solution.CallFourthSolution;
import by.matmux.service.second_solution.CallSecondSolution;
import by.matmux.service.third_solution.CallThirdSolution;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final CallFirstSolution firstSolution = new CallFirstSolution();
    private final CallThirdSolution thirdSolution = new CallThirdSolution();
    private final CallSecondSolution secondSolution = new CallSecondSolution();
    private final CallFourthSolution fourthSolution = new CallFourthSolution();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public CallFirstSolution getFirstSolution() {
        return firstSolution;
    }

    public CallThirdSolution getThirdSolution() {
        return thirdSolution;
    }

    public CallFourthSolution getFourthSolution() {
        return fourthSolution;
    }

    public CallSecondSolution getSecondSolution() {
        return secondSolution;
    }
}
