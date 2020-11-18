package by.matmux.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class Matrix {

    private static final Logger log = LogManager.getLogger(Matrix.class);

    /** Singleton object. */
    private static final Matrix instance = new Matrix();

    /** Stores the size of the matrix. */
    private int n;

    /** Lower bound on the matrix size. */
    private static final int N1 = 5;

    /** Higher bound on the matrix size. */
    private static final int N2 = 100;

    /** Stores matrix. */
    private MatrixMember[][] matrix;

    private Matrix() { }

    public static Matrix getInstance() {
            return instance;
    }

    public MatrixMember[][] getMatrix() {
        return matrix;
    }

    /**
     * Creates a matrix of the passed size.
     * @param n - size of the matrix
     * @return true - if n does not go beyond the bounds, otherwise - false
     */
    //TODO матрица не singleton, вынести в конструктор
    public boolean setN(final int n) {
        if (n > N1 && n < N2) {
            this.n = n;
            matrix  = new MatrixMember[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = new MatrixMember();
                }
            }
            return true;
        }
        return false;
    }

    public void show() {
        Path path = Paths.get("src/main/files/outputMatrix.txt");
        StringBuilder sb = new StringBuilder();
        try (FileWriter outputStream = new FileWriter(String.valueOf(path))) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(matrix[i][j] + " ");
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

    public int length() {
        return matrix.length;
    }
}
