package bu.matmux.Runner;

public class Runner {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            sum += x;
        }
        System.out.println(sum);
    }
}
