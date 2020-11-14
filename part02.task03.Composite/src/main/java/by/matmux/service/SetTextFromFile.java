package by.matmux.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SetTextFromFile {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(SetTextFromFile.class);

    private SetTextFromFile() { }

    /**
     * Reads the file to a string for text initialization.
     * @return string with text
     */
    public static String set() {
        File file = new File("src/files/input.txt");
        String path = file.getAbsolutePath();
        StringBuilder result = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                result.append(sc.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            log.debug("FileNotFoundException when reading file");
        } catch (IOException e) {
            log.debug("IOException when reading file");
        }
        return result.toString();
    }
}
