package by.matmux.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SetNumberOfThread {
    /** Logger. */
    private static final Logger logger = LogManager.getLogger(SetNumberOfThread.class);

    private SetNumberOfThread() { }
    /**
     * Set number of thread from file.
     */
    public static int set() {
        Path path = Paths.get("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/part02.task02.Thread/src/main/files/inputNumberOfThread");
        try (FileInputStream reader = new FileInputStream(String.valueOf(path))) {
            Scanner sc = new Scanner(reader);
            return sc.nextInt();
        } catch (FileNotFoundException e) {
            logger.warn("FileNotFindException");
        } catch (IOException e) {
            logger.warn("IOException");
        }
        return 2;
    }
}
