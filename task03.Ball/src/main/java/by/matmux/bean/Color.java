package by.matmux.bean;

public enum Color {
    // TODO переделать этот класс чтобы значения стоимости и вес можно было вводить пользователю
    RED(3, 1),
    GREEN(5,3),
    PINK(2, 1),
    BLUE(3, 2),
    YELLOW(4, 3),
    WHITE(3, 2),
    ORANGE(2, 3),
    PURPLE(1, 1),
    BROWN(6, 4);

    private final int cost;
    private final int weight;

    private Color (int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost () {
        return this.cost;
    }

    public int getWeight () {
        return this.weight;
    }

    public Color getRandomColor () {
        Color[] arrColor = Color.values();
        return arrColor[(int) (Math.random() * 8) + 1];
    }
}
