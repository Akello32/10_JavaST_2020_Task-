package by.matmux.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Consumer {
    private static final Logger log = LogManager.getLogger(Consumer.class);
    public String setRequest() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void show(final String response) {
        log.debug(response);
    }
}
