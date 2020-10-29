package by.matmux;

public class Runner {
    public static void main(String[] args) {
        RunnablePerson p1 = new RunnablePerson("First Person");
        RunnablePerson p2 = new RunnablePerson("Second Person");
        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);
        th1.start();
        th2.start();
    }
}
