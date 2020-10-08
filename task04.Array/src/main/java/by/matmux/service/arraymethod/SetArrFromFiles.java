package by.matmux.service.arraymethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SetArrFromFiles {
    /**
     * set array from file
     * @param arr
     * @return message of result
     */
    public String set(final int[] arr) {
        int i = 0;
        int enter;
        String str;
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("/home/mustafarara/GitFolder/10_JavaST-2020_Task-/task04.Array/inputData/inputArray"))) {
            while ((str = reader.readLine()) != null) {
                enter = Integer.parseInt(str);
                arr[i] = enter;
                i++;
            }
        } catch (IOException ex) {
            return "Input error" + ex;
        }

        return "Your array is full";
    }
}
