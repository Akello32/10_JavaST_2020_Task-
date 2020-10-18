package by.matmux.beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Book {
    private String title;
    private ArrayList<String> authors;
    private int numberOfPage;
    private String publishingHouse;
    private Calendar yearOfPublishing;

    public Book(String title, ArrayList<String> authors, int numberOfPage,
                String publishingHouse, Calendar yearOfPublishing) {
        this.title = title;
        this.authors = authors;
        this.numberOfPage = numberOfPage;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }


    public Calendar getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ",\n authors=" + authors +
                ",\n numberOfPage=" + numberOfPage +
                ",\n publishingHouse='" + publishingHouse + '\'' +
                ",\n yearOfPublishing=" + yearOfPublishing.getTime() +
                "} \n";
    }
}
