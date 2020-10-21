package by.matmux.service;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SetBooksFromFile {
    /**
     * writes a book from a file and adds it to the repository
     * @return a result of adding
     */
    public String setBooks() {
        BookRepository repository = BookRepository.getInstance();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<String> paramsList = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream("files/inputFiles.txt")){
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                String[] str = sc.nextLine().trim().split(", ");
                paramsList.addAll(Arrays.asList(str));
                authors.addAll(Arrays.asList(paramsList.get(1).split(" ")));
                repository.addBook(new Book(authors, paramsList));
                authors.clear();
                paramsList.clear();
            }
        } catch (IOException ex) {

        }
        return "Books set";
    }
}
