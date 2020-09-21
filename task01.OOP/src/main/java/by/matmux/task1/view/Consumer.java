package by.matmux.task1.view;

import by.matmux.task1.bean.Number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Consumer {

    private Consumer() {
        throw new IllegalStateException("Utility class");
    }

    /** Accepts values entered by the user and returns them. */
        public static int enterNumbers() throws IOException {
        System.out.println("Enter a number");
        boolean checkForPositiv = false;
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!checkForPositiv) {
            n = Integer.parseInt(reader.readLine());
            checkForPositiv = n > 0;
        }
        return n;
    }

    /** Shows the result of the program execution. */
    public static void showResult(final Number n) {
        System.out.println("Your number is perfect: " + n.getCheck());
    }
}
