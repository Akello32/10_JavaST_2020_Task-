package by.matmux.task1.service;

import by.matmux.task1.bean.Number;

public final class TestingForPerfection {

    private TestingForPerfection() {
        throw new IllegalStateException("Utility class");
    }

    /** Array with perfect numbers. */
    private static final int[] ARR_OF_PERFECT_NUMBER = {6, 28, 496, 8128, 33550336};

    /** Checks whether the number is perfect and returns them. */
    public static boolean testingForPerfection(final Number n) {
        for (int i : ARR_OF_PERFECT_NUMBER) {
            if (n.getValue() == i) {
                return true;
            }
        }

        return false;
    }
}
