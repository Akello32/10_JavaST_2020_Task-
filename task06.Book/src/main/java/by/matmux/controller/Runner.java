package by.matmux.controller;

import by.matmux.beans.Book;
import by.matmux.dao.BookRepository;
import by.matmux.dao.query.search_query.SearchAuthorsQuery;
import by.matmux.dao.query.search_query.SearchPageQuery;
import by.matmux.dao.query.sort_query.SortAuthorsQuery;
import by.matmux.dao.query.sort_query.SortPagesQuery;
import by.matmux.dao.query.sort_query.SortYearQuery;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tolkien");
        arrayList.add("Matvei");
        Calendar calendar = new GregorianCalendar(1899, Calendar.AUGUST, 23);
        Book book1 = new Book("Властелин колец", arrayList, 433, "Лондон", calendar);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Roaling");
        arrayList2.add("Jhon");
        arrayList2.add("Tim");
        Book book2 = new Book("Властелин колец: 2", arrayList2, 500, "Лондон", new GregorianCalendar(1770, Calendar.APRIL, 54));
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Curt");
        arrayList3.add("Mike");
        arrayList3.add("Nik");
        Book book3 = new Book("Ведьмак", arrayList3, 300, "Краков", new GregorianCalendar(1967, Calendar.APRIL, 1));
        BookRepository repository = new BookRepository();
        repository.addBook(book1);
        repository.addBook(book2);
        repository.addBook(book3);
        SortAuthorsQuery authorsQuery = new SortAuthorsQuery();
        SearchPageQuery pageQuery = new SearchPageQuery(500);
        SortPagesQuery pagesQuery = new SortPagesQuery();
        SortYearQuery yearQuery = new SortYearQuery();
        ArrayList<String> authors = new ArrayList<>();
        authors.addAll(Arrays.asList("Curt", "Mike", "Nik"));
        SearchAuthorsQuery authorsQuery1 = new SearchAuthorsQuery(authors);
/*        System.out.println(yearQuery.query(repository.getBookSet()));*/
/*        System.out.println(repository.query(pagesQuery));*/
/*        System.out.println(repository.findByTag(pageQuery));*/
/*        System.out.println(authorsQuery.query(repository.getBookSet()));*/
    }
}
