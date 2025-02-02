import java.util.concurrent.Exchanger;

public class Runner {
    private static int n = 1;
    public static void main(String[] args) {

        Exchanger<String> ex = new Exchanger();

        for (int i = 1; i <= n; i++) {

            Thread t1 = new Thread(new PutThread(ex));
            Thread t2 = new Thread(new GetThread(ex));

            t1.setName("Поток Put " + i);
            t2.setName("Поток Get " + i);

            t1.start();
            t2.start();

        }
    }
}
