package by.matmux.beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Album extends Edition{
    public Album(final ArrayList<String> authors, final ArrayList<String> paramsList) {
        super(authors, paramsList);
    }

    public Album(final String title, final ArrayList<String> authors,
                   final int numberOfPage, final String publishingHouse, final Date yearOfPublishing, final String type) {
        super(title, authors, numberOfPage, publishingHouse, yearOfPublishing, type);
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return "\n" + getType() + "{" +
                "title = '" + getTitle() + '\'' +
                ",\n photographers = " + getAuthors().toString() +
                ",\n numberOfPage = " + getNumberOfPage() +
                ",\n publishingHouse = '" + getPublishingHouse() + '\'' +
                ",\n yearOfPublishing = " + format.format(getYearOfPublishing()) +
                ",\n id = " + getId() +
                "} \n";
    }
}
