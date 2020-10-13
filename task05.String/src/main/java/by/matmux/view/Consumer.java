package by.matmux.view;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Consumer {
    public String setTextFromConsole() {
        String text;
        System.out.println("Enter the text");
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();

        return text;
    }

    public String enterChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one character!");
        StringBuilder ch = new StringBuilder();
        ch.append(sc.nextLine());
        while (ch.length() > 1) {
            System.out.println("Enter the one character!!!");
            ch.delete(0, ch.length());
            ch.append(sc.nextLine());
        }

        return ch.toString();
    }

    public String enterWord() {
        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public int enterNumber() {
            System.out.println("Enter the required parameter: word length or letter position");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public String setTextFromFile() {
        StringBuilder text = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/task05.String/InputFile/file.txt")){
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                text.append(sc.nextLine() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        return text.toString();
    }

    public String setRequest() {
        String request;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CHANGE_CHAR to change the symbol in the desired position \n" +
                "Enter CHANGE_WORD to change the word desired length \n" +
                "Enter DELETING_WORDS to delete all words desired length \n" +
                "Enter MISTAKE_CHANGE to change mistake in the word \n" +
                "Enter REMOVE_ALL_EXCEPT_LETTER to delete all char except letter and double spaces \n" +
                "Enter EXIT to exit the program \n" +
                "Enter SET_TEXT_FROM_CONSOLE to set text from console \n" +
                "Enter SET_TEXT_FROM_FILE to set text from file \n");

        return request = sc.next();
    }

    public void show(String response) {
        System.out.println(response);
    }
}
