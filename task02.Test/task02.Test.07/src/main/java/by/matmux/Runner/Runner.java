package by.matmux.Runner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Calendar toDay = new GregorianCalendar();
        Calendar BirthDay = new GregorianCalendar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your BirthDay");
        BirthDay.set(Calendar.DATE, sc.nextInt());
        System.out.println("Enter your month of birth");
        BirthDay.set(Calendar.MONTH, sc.nextInt());
        System.out.println("Enter your year of birth");
        BirthDay.set(Calendar.YEAR, sc.nextInt());
        sc.close();

        int age = toDay.get(Calendar.YEAR) - BirthDay.get(Calendar.YEAR);
        System.out.println("You were born on a " + BirthDay.get(Calendar.DAY_OF_WEEK));
        System.out.println("Your age " + age);
        if (toDay.get(Calendar.DATE) == BirthDay.get(Calendar.DATE)) {
            System.out.println("Happy BirthDay!!!");
            }
    }
}
