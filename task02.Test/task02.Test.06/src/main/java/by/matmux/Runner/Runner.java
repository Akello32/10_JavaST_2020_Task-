package by.matmux.Runner;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<String, Integer> developersList = new HashMap<>();

        developersList.put("John", 3);
        developersList.put("Mike", 5);
        developersList.put("Live", 1);
        developersList.put("Belarus", 2);

        Calendar deadLine = new GregorianCalendar(2020, Calendar.SEPTEMBER, Integer.parseInt(args[0]));
        System.out.println("The start day " + deadLine.getTime());

        for (Map.Entry entry : developersList.entrySet()) {
            deadLine.add(Calendar.DAY_OF_MONTH, (int) entry.getValue());
            System.out.println(deadLine.getTime() + " the " + entry.getKey() +" will complete the task.");
        }
    }
}
