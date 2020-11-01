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
     * accepts the type from the user
     * @return the type
     */
    public String enterType() {
        System.out.println("Enter the type of the book");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * accepts the id from the user
     * @return the id
     */
    public int enterId() {
        System.out.println("Enter the id of the book");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * accepts the authors from the user
     * @return return ArrayList with authors
     */
    public ArrayList<String> enterAuthors() {
        System.out.println("Enter the authors of the book separated by commas");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> authors = new ArrayList<>();
            String s = sc.nextLine();
            authors.addAll(Arrays.asList(s.trim().split(", ")));
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
        System.out.println("Enter a date");
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

    public String enterParamsForUpd() {
        System.out.println("Enter the parameter to update in this form (title = Fight club)");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * accepts the publishing house from the user
     * @return the publishing house
     */
    public String enterPublishingHouse() {
        System.out.println("Enter a publishing house of the edition");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * Shows menu
     */
    public void showMenu() {
        System.out.println("Enter SET_EDITION_FROM_FILES to set editions from file\n" +
                "Enter ADD_BOOK to add book in the storage\n" +
                "Enter ADD_JOURNAL to add journal in the storage\n" +
                "Enter ADD_ALBUM to add album in the storage\n" +
                "Enter REMOVE_JOURNAL to remove journal in the storage\n" +
                "Enter REMOVE_BOOK to remove book in the storage\n" +
                "Enter REMOVE_ALBUM to remove album in the storage\n " +
                "Enter UPDATE_EDITION to update edition in the storage \n \n" +

                "Enter FIND_EDITION_BY_TITLE to find editions by title in the storage\n" +
                "Enter FIND_EDITION_BY_AUTHORS to find editions by authors in the storage\n" +
                "Enter FIND_EDITION_BY_NUMBER_PAGES to find editions by number of pages in the storage\n" +
                "Enter FIND_EDITION_BY_DATE to find editions by date of publishing int the storage\n" +
                "Enter FIND_EDITION_BY_PUBLISHING_HOUSE to find editions by publishing house in the storage\n" +
                "Enter FIND_EDITION_BEFORE_DATE to find editions by released before the transmitted date in the storage\n" +
                "Enter FIND_EDITION_BY_ID to find edition by id int the storage\n" +
                "Enter FIND_EDITION_INTERVAL_ID to find editions in the desired id interval\n" +
                "Enter FIND_EDITION_BY_TYPE to find editions by type in the storage\n \n" +

                "Enter SORT_EDITION_BY_TITLE to sort the edition by title\n" +
                "Enter SORT_EDITION_BY_AUTHORS to sort the edition by authors\n" +
                "Enter SORT_EDITION_BY_NUMBER_PAGES to sort the edition by number of pages\n" +
                "Enter SORT_EDITION_BY_PUBLISHING_HOUSE to sort the edition by publishing house\n" +
                "Enter SORT_EDITION_BY_DATE to sort the edition by date\n" +
                "Enter SORT_ALBUM_BY_TITLE to sort the albums by title\n" +
                "Enter SORT_BOOK_BY_NUMBER_PAGES to sort the books by number of pages\n" +
                "Enter SORT_JOURNAL_BY_AUTHORS to sort the journals by authors");
    }

    /**
     * gets request
     * @return
     */
    public String setRequest() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * outputs the response in the file
     * @param response - stores the response to the request
     */
    public void show(String response) {
        try (FileWriter outputStream = new FileWriter("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/part2.task01.UpdBook/src/files/output.txt")) {
            outputStream.write(response);
        } catch (IOException e) {
            System.out.println("Error opening the file");
        }
    }

    /**
     * outputs the observer info in the file
     * @param info - information from observers
     */
    public void showObserverInf(String info) {
        try (FileWriter outputStream = new FileWriter("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/part2.task01.UpdBook/src/files/observerOutput.txt")) {
            outputStream.write(info);
        } catch (IOException e) {
            System.out.println("Error opening the file");
        }
    }
}