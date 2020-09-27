package by.matmux.view;

import by.matmux.bean.Color;

import java.util.Scanner;

public class Consumer {
    public int enterChoiceNumber() {
        Scanner sc = new Scanner(System.in);
        boolean correctNumber = true;
        int selectedNum = 0;
        while (correctNumber) {
            try {
                selectedNum = sc.nextInt();
            } catch (NumberFormatException ex) {
                System.out.println("Enter a INTEGER!");
            }

            if (selectedNum > 0 && selectedNum <= 9) {
                correctNumber = false;
            } else { System.out.println("Incorrect number"); }

        }
        return selectedNum;
    }

    public Color enterColor() {
        Color color;
        Scanner sc = new Scanner(System.in);
        color = Color.valueOf(sc.next());
        return color;
    }

    public int returnInt() {
        Scanner sc = new Scanner(System.in);
        int returnNum = 0;
        boolean correctNumber = true;
        try {
            returnNum = sc.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("Enter a INTEGER!");
            return 0;
        }
        return returnNum;
    }
}
