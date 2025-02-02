package by.matmux.view;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Consumer {
    /**
     * accepts the title from the user
     * @return the title
     */
    public String enterTitle() {
        System.out.println("Enter the title of the book");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * accepts the authors from the user
     * @return return ArrayList with authors
     */
    public ArrayList<String> enterAuthors() {
        System.out.println("Enter the authors of the book");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> authors = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s == null) {
                break;
            }
            authors.add(s);
        }
        return authors;
    }

    /**
     * accepts the number of pages from the user
     * @return the number of pages
     */
    public int enterNumberPages() {
        System.out.println("Enter a number of pages");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * accepts the date of publishing from the user
     * @return the date of publishing
     */
    public Date enterDate() {
        Date date;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            date = format.parse(sc.nextLine());
            return date;
        } catch (ParseException e) {
            System.out.println("Error when entering data");
        }
        return date = new Date(2020, Calendar.SEPTEMBER, 21);
    }

    /**
     * accepts the publishing house from the user
     * @return the publishing house
     */
    public String enterPublishingHouse() {
        System.out.println("Enter a publishing house of the book");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * Shows menu and gets
     * @return
     */
    public String setRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ADD_BOOK to add book in the storage\n" +
                "Enter REMOVE_BOOK to remove book in the storage\n" +
                "Enter FIND_BOOK_BY_TITLE to find book by title in the storage\n" +
                "Enter FIND_BOOK_BY_AUTHORS to find book by authors in the storage\n" +
                "Enter FIND_BOOK_BY_NUMBER_PAGES to find book by number of pages in the storage\n" +
                "Enter FIND_BOOK_BY_DATE to find book by date of publishing int the storage\n" +
                "Enter FIND_BOOK_BY_PUBLISHING_HOUSE to find book by publishing house in the storage\n" +
                "Enter SORT_BOOK_BY_TITLE to sort the books by title\n" +
                "Enter SORT_BOOK_BY_AUTHORS to sort the books by authors\n" +
                "Enter SORT_BOOK_BY_NUMBER_PAGES to sort the books by number of pages\n" +
                "Enter SORT_BOOK_BY_PUBLISHING_HOUSE to sort the books by publishing house\n" +
                "Enter SORT_BOOK_BY_DATE to sort the books by date\n" +
                "Enter SET_BOOK_FROM_FILES to set books from file");
        return sc.nextLine();
    }

    public void show(String response) {
            try (FileWriter outputStream = new FileWriter("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/task06.Book/src/files/output.txt")) {
            outputStream.write(response);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}