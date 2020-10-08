package by.matmux.view;

import by.matmux.bean.Array;

import java.util.Scanner;

public class Consumer {
    /**
     * consume the number
     * @return
     */
    public int enterNumber() {
        System.out.println("Enter the number");
        return new Scanner(System.in).nextInt();
    }

    public boolean enterBoolean() {
        System.out.println("Enter the boolean");
        return new Scanner(System.in).nextBoolean();
    }

    public String setFromConsole(Array array) {
        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.getArr().length; i++) {
            array.set(i, sc.nextInt());
        }
        return "Your array is full";
    }

    public String setRequest() {
        System.out.println("\n Enter ADDITION_ARR to add two jaggedArray \n" +
                "Enter BINARY_SEARCH to find the number in an Array \n" +
                "Enter FIBONACHI to find all fibonachi numbers in an Array \n" +
                "Enter FIND_BY_VALUE to find number in an Array by value \n" +
                "Enter FIND_MAX to find max number in an Array \n" +
                "Enter FIND_MIN to find mun number in an Array \n" +
                "Enter FIND_PRIME to find all prime number in an Array \n" +
                "Enter FIND_THREE_DIGITS to find all three - digit numbers whose " +
                "decimal notation does not contain the same digits in an Array of the Array type. \n" +
                "Enter MULTIPLICATION to multiply two jaggedArray's \n" +
                "Enter QUICK_SORT_ARR to to sort an array with quick sort \n" +
                "Enter SHELL_SORT to sort an array with shell sort \n" +
                "Enter SHUTTLE_SORT to sort an array with shuttle sort \n" +
                "Enter SET_ARR_RANDOM to set an array from Random numbers \n" +
                "Enter SET_ARR_FILES to set an array from files \n" +
                "Enter SET_ARR_CONSOLE to set an array form console \n" +
                "Enter SORT_MAX_IN_ROW to sort an jaggedArray by the maximum element in a row \n" +
                "Enter SORT_MIN_IN_ROW to sort an jaggedArray by the minimum element in a row \n" +
                "Enter SORT_SUM_ROW to sort an jaggedArray by the sum of element in a row \n" +
                "Enter TRANSPOSITION to transpose a jaggedArray \n" +
                "Enter CHECK_SQUARE to to check if the matrix is square\n" +
                "Enter a EXIT to a close a programme");

        Scanner sc = new Scanner(System.in);
        String request = sc.next();
        return request;
    }

    public void show(Object o) {
        System.out.println(o.toString());
    }
}
