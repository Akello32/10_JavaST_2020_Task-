package by.matmux.view;

import java.util.Scanner;

public class Consumer {

    public void showSol() {
        System.out.println("Enter FIRST_SOLUTION to start the first solution \n" +
                "Enter SECOND_SOLUTION to start the second solution \n" +
                "Enter THIRD_SOLUTION to start the third solution \n" +
                "Enter FOURTH_SOLUTION to start the fourth solution");
    }

    public String enterRequest() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
