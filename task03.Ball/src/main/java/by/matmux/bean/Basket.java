package by.matmux.bean;;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> ballsList = new ArrayList<>();
    private int quantity;
    private int weightAllBallInBasket;

    public void addBallInToList (Ball ball) { ballsList.add(ball); }

    @Override
    public String toString() {
        StringBuilder b1 = new StringBuilder();
        for (Ball b : ballsList) {
            b1.append(b.toString());
        }
        return b1.toString();
    }
}
