package by.matmux;

public class ThreadHello extends Thread {
    @Override
    public void run() {
        System.out.println("Hello - " + getName());
    }

    public static void main(String[] args) {
        ThreadHello th = new ThreadHello();
        th.start();
        System.out.println(Thread.currentThread().getName());
    }
}
