package by.matmux.bean;

public enum Color {
    RED(3), GREEN(5), PINK(2), BLUE(3), YELLOW(4), WHITE(3);

    private final int cost;

    private Color (int cost) {
        this.cost = cost;
    }

    public int getCost () {
        return this.cost;
    }

    public Color getRandomColor () {
        Color[] arrColor = Color.values();
        return arrColor[(int) (Math.random() * 5) + 1];
    }
}
