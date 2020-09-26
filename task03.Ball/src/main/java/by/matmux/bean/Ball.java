package by.matmux.bean;

import java.util.Objects;

public class Ball {
    private Color color = Color.GREEN;
    private int cost;
    private int weight;

    public Ball() {
        color = color.getRandomColor();
        cost = color.getCost();
        weight = color.getWeight();
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
    public boolean equals(final Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Ball ball = (Ball) o;
        return cost == ball.cost &&
                color == ball.color &&
                weight == ball.weight;
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


