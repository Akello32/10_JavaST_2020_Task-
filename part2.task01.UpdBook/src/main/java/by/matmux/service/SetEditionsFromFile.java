package by.matmux.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetEditionsFromFile {
    /**
     * writes a book from a file and adds it to the repository
     *
     * @return a result of adding
     */
    public String setBooks() {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<String> paramsList = new ArrayList<>(5);
        String[] tempArr = {"Basic", "Basic", "111", "Basic", "Basic"};
        paramsList.addAll(Arrays.asList(tempArr));
        try (FileInputStream inputStream = new FileInputStream("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/part2.task01.UpdBook/src/files/inputFiles.txt")){
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                String[] str = sc.nextLine().trim().split(";");
                for (String s : str) {
                    Pattern pattern = Pattern.compile("[^=]*$");
                    Matcher matcher = pattern.matcher(s);
                    String temp;
                    if (s.contains("type") && matcher.find()) {
                            temp = matcher.group().trim();
                            paramsList.set(0, temp);
                    } else if (s.contains("title") && matcher.find()) {
                            temp = matcher.group().trim();
                            paramsList.set(1, temp);
                    } else if (s.contains("numbers of page") && matcher.find()) {
                            temp = matcher.group().trim();
                            if (temp.matches("\\d")) {
                                paramsList.set(2, temp);
                            } else { paramsList.set(2, "111"); }
                    } else if (s.contains("publishing house") && matcher.find()) {
                            temp = matcher.group().trim();
                            paramsList.set(3, temp);
                    } else if (s.contains("year of publishing") && matcher.find()) {
                            temp = matcher.group().trim();
                            paramsList.set(4, temp);
                    } else if (s.contains("authors") && matcher.find()) {
                            temp = matcher.group().trim();
                            String[] authorsArr = temp.trim().split(", ");
                            authors.addAll(Arrays.asList(authorsArr));
                    }
                }
                serviceFactory.getAddEdition().add(GetObjectByType.get(authors, paramsList));
                paramsList.clear();
                paramsList.addAll(Arrays.asList(tempArr));
                authors.clear();
            }
        } catch (IOException ex) {
            return "Error";
        } catch (IllegalArgumentException e) {
            paramsList.add(0,"Book");
        }
        return "Book set";
    }
}
