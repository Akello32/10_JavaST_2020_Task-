package by.matmux.service;

import by.matmux.beans.Album;
import by.matmux.beans.Book;
import by.matmux.beans.Edition;
import by.matmux.beans.Journal;

import java.util.ArrayList;

public final class GetObjectByType {
    private GetObjectByType() {}

    /**
     * Returns object by passed type
     * @param authors - list of authors
     * @param paramsList - list of paramsList
     * @return filled object by passed type
     */
    public static Edition get(final ArrayList<String> authors, final ArrayList<String> paramsList) {
        if (paramsList.get(0).equals("Book")) {
            return new Book(authors, paramsList);
        } else if (paramsList.get(0).equals("Journal")) {
            return new Journal(authors, paramsList);
        } else if (paramsList.get(0).equals("Album")) {
            return new Album(authors, paramsList);
        }
        return new Book(authors, paramsList);
    }
}
