/** Contains the constants with names of color */

package by.matmux.bean;

public enum Color {
    RED, GREEN, PINK, BLUE, YELLOW, WHITE, ORANGE, PURPLE, BROWN;

    Color() {

    }

    /** @return a random color */
    public Color getRandomColor() {
        Color[] arrColor = Color.values();
        return arrColor[(int) (Math.random() * Color.values().length) + 1];
    }
}
