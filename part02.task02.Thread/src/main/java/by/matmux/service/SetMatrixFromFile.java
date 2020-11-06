package by.matmux.service;

import by.matmux.beans.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SetMatrixFromFile {
    private static final Logger logger = LogManager.getLogger(SetMatrixFromFile.class.getName());

    /**
     * Fills matrix from file
     * @param matrix - the matrix that needs to be filled
     */
    public void set(final Matrix matrix) {
        Path path = Paths.get("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/part02.task02.Thread/src/main/files/inputMatrix.txt");

        try (FileInputStream reader = new FileInputStream(String.valueOf(path))) {
            Scanner sc = new Scanner(reader);
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine() + " ");
            }
            String[] arr = sb.toString().trim().split(" ");
            boolean choice = matrix.setN((int) Math.sqrt(arr.length));
            if (choice) {
                int count = 0;
                for (int i = 0; i < matrix.length(); i++) {
                    for (int j = 0; j < matrix.length(); j++) {
                        matrix.getMatrix()[i][j].setValue(Integer.parseInt(arr[count]));
                        count++;
                    }
                }
            } else {
                logger.warn("The length of the matrix is out of bounds");
            }
        } catch (FileNotFoundException e) {
            logger.warn("FileNotFindException");
        } catch (IOException e) {
            logger.warn("IOException");
        }
    }
}
