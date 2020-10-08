/**
 * Еhe class contains basic fields that describe the entity Ball of the
 * object and methods for accessing them
 */


package by.matmux.bean;

import java.util.Objects;

public class Ball {
    private Color color;
    private int cost;
    private int weight;

    public Ball(final Color color, final int cost, final int weight) {
        this.color = color;
        this.cost = cost;
        this.weight = weight;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
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


