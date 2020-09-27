package by.matmux.bean;;

import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    private ArrayList<Ball> ballsList = new ArrayList<>();

    public void addBallInToList (final Ball ball) { ballsList.add(ball); }

    public ArrayList<Ball> getBallsList() {
        return ballsList;
    }

    public int getSizeBasket() {
        return ballsList.size();
    }

    public Ball getBall(int i) {
        return ballsList.get(i);
    }

    @Override
    public String toString() {
        StringBuilder b1 = new StringBuilder();
        for (Ball b : ballsList) {
            b1.append(b.toString());
        }
        return b1.toString();
    }
}
