package by.matmux.service;

import by.matmux.beans.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ShowMatrix {
    /** Singleton object. */
    private static final ShowMatrix instance = new ShowMatrix();

    /** Logger. */
    private static final Logger log = LogManager.getLogger(ShowMatrix.class.getName());

    /** Matrix. */
    private final Matrix matrix = Matrix.getInstance();

    private ShowMatrix() { }

    public static ShowMatrix getInstance() {
        return instance;
    }

    /**
     * Shows the matrix in the file.
     */
    public void show() {
        Path path = Paths.get("src/main/files/outputMatrix.txt");
        StringBuilder sb = new StringBuilder();
        try (FileWriter outputStream = new FileWriter(String.valueOf(path))) {
            for (int i = 0; i < matrix.length(); i++) {
                for (int j = 0; j < matrix.length(); j++) {
                    sb.append(matrix.getMatrix()[i][j] + " ");
                }
                sb.append("\n");
            }
            outputStream.write(sb.toString());
        } catch (FileNotFoundException e) {
            log.warn("FileNotFoundException");
        } catch (IOException e) {
            log.warn("IOException");
        }
    }
}
