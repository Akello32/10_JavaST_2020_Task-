package by.matmux.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Edition {
    private String title;
    private ArrayList<String> authors;
    private int numberOfPage;
    private String publishingHouse;
    private Date yearOfPublishing;
    private String type;
    private int id;

    public Edition(final ArrayList<String> authors, final ArrayList<String> paramsList, final String type) {
        this.title = paramsList.get(0);
        this.authors = new ArrayList<>(authors);
        this.numberOfPage = Integer.parseInt(paramsList.get(2));
        this.publishingHouse = paramsList.get(3);
        this.type = type;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            Date date = format.parse(paramsList.get(4));
            this.yearOfPublishing = date;
        } catch (ParseException e) {
            this.yearOfPublishing = new Date(2020, Calendar.SEPTEMBER, 21);
        }
    }

    public Edition(String title, ArrayList<String> authors, int numberOfPage, String publishingHouse, Date yearOfPublishing) {
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

    public String getType() { return type; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public Date getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return "Book{" +
                "title = '" + title + '\'' +
                ",\n authors = " + authors.toString() +
                ",\n numberOfPage = " + numberOfPage +
                ",\n publishingHouse = '" + publishingHouse + '\'' +
                ",\n yearOfPublishing = " + format.format(yearOfPublishing) +
                "} \n";
    }
}
