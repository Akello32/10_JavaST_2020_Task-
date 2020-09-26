package by.matmux.task1.service;

import by.matmux.task1.bean.Number;

public final class TestingForPerfection {

    private TestingForPerfection() {
        throw new IllegalStateException("Utility class");
    }

    /** Array with perfect numbers. */
/*    private static final int[] ARR_OF_PERFECT_NUMBER = {6, 28, 496, 8128, 33550336};*/

    /** Checks whether the number is perfect and returns them. */
    public static boolean testingForPerfection(final Number n) {
        int sum = 0;
        int i = 1;

        if (n.getValue() == 6) {
            return true;
        } else {
            while (!(sum == n.getValue())) {
                sum += Math.pow(i, 3);
                i += 2;
            }
        }

        if (sum == n.getValue()) {
            return true;
        } else {
            return false;
        }
    }
}

