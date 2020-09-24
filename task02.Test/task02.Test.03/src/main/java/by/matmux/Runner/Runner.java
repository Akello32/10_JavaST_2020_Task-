package by.matmux.Runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int[] arrNumbers = new int[number];
        fillArr(arrNumbers);
        println(arrNumbers);
        System.out.println();
        printn(arrNumbers);
    }

    public static void println(int[] arr) {
        for (int i: arr) {
            System.out.println(arr[i]);
        }
    }

    public static void printn(int[] arr) {
        for (int i: arr) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
        }
    }
}
