package by.matmux.view;

import by.matmux.bean.Ball;
import by.matmux.bean.Basket;
import by.matmux.bean.Color;

import java.util.Scanner;

public final class Consumer {
    public int enterNumBasket() {
        System.out.println("Enter a basket number");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt() - 1;
    }

    public int enterNum() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public Color enterColorBall() {
        System.out.println("Enter a balls color");
        Scanner sc = new Scanner(System.in);

        return Color.valueOf(sc.next());
    }

    public String fillTheBasket(final Basket basket) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of balls");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter a color");
            Color color = Color.valueOf(sc.next());
            System.out.println("Enter a cost");
            int cost = sc.nextInt();
            System.out.println("Enter a weight");
            int weight = sc.nextInt();
            basket.addBallInToList(new Ball(color, cost, weight));
        }

        return null;
    }

    public String setRequest() {
        System.out.println("\n Enter FILLER_BASKET to fill the basket \n" +
                "Enter ADD_BASKET to create the basket \n" +
                "Enter FILL_YOURSELF to fill the basket yourself \n" +
                "Enter CHECK_EQUALITY_BALL to check how many equals balls in the basket \n" +
                "Enter CHECK_QUANTITY to check how many balls in the basket have the same color \n" +
                "Enter CHECK_WEIGHT to determine the weight of balls in the basket \n" +
                "Enter OUTPUT_TO_COST to display information about the balls in the basket \n" +
                "in ascending order of their price \n" +
                "Enter CHECK_BASKET_EQUAL to check how many identical buckets there are \n" +
                "Enter EXIT to exit the programme \n");
        Scanner sc = new Scanner(System.in);
        String request = sc.next();
        return request;
    }
}
