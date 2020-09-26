package by.matmux.bean;

import java.util.Objects;

public class Ball {
    private Color color = Color.GREEN;
    private int cost;
    private final int weight = 1;

    public Ball () {
        color = color.getRandomColor();
        cost = color.getCost();
    }

    public Color getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return cost == ball.cost &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, cost);
    }

    @Override
    public String toString() {
        return "\nBall{" +
                "color=" + color +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}


