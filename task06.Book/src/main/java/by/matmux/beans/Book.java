package by.matmux.beans;

import java.util.Date;

public class Book {
    private String title;
    private String authors;
    private int numberOfPage;
    private String publishingHouse;
    private Date yearOfPublishing;

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }


    public Date getYearOfPublishing() {
        return yearOfPublishing;
    }
}
