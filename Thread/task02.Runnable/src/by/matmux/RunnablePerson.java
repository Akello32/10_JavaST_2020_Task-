package by.matmux;

public class RunnablePerson extends Person implements Runnable {
    public RunnablePerson(String lastName) {
        super(lastName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world - " + getLastName());
        }
    }
}
