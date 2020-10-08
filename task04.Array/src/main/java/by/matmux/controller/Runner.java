package by.matmux.controller;

import by.matmux.bean.Array;
import by.matmux.bean.JaggedArray;
import by.matmux.controller.command.CommandNameJaggedArray;
import by.matmux.view.Consumer;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        final Controller<JaggedArray, Consumer> controllerForJaggArr = new Controller<>();
        final Controller<Array, Consumer> controllerForArray = new Controller<>();
        final Controller<JaggedArray, JaggedArray> controllerForAddSubJaggArr = new Controller<>();
        final Consumer consumer = new Consumer();
        Array array = new Array(new int[10]);
        int[][] a = {{321, 1445, 411, 66, 1}, {62, 97}, {111, 555, 56}, {234}};
        JaggedArray jaggedArray = new JaggedArray(a);
        int[][] a1 = {{152, 151, 911, 6, 10}, {6, 45}, {105, 191, 50}, {4}};
        JaggedArray jaggedArray1 = new JaggedArray(a1);

        String selectedCommand;
        boolean choice = true;

        while (choice) {
            selectedCommand = consumer.setRequest();

            if (selectedCommand.equals("EXIT")) { choice = false; break; }

            if (selectedCommand.equals("SET_ARR_CONSOLE")) {
                consumer.show(consumer.setFromConsole(array));
            } else if (selectedCommand.equals("SUBTRACTION") || selectedCommand.equals("ADDITION_ARR")) {
                consumer.show(controllerForAddSubJaggArr.executeTask(selectedCommand, jaggedArray, jaggedArray1));
                consumer.show(jaggedArray);
            } else if (selectedCommand.equals("TRANSPOSITION") || selectedCommand.equals("CHECK_SQUARE")
                        || selectedCommand.equals("SORT_SUM_ROW") || selectedCommand.equals("SORT_MIN_IN_ROW")
                        || selectedCommand.equals("SORT_MAX_IN_ROW") || selectedCommand.equals("MULTIPLICATION") ) {
                consumer.show(controllerForJaggArr.executeTask(selectedCommand, jaggedArray, consumer));
                consumer.show(jaggedArray);
            } else {
                consumer.show(controllerForArray.executeTask(selectedCommand, array, consumer));
                consumer.show(array);
            }
        }
    }

    /*Arrays.asList(CommandNameJaggedArray.values()).contains(selectedCommand)*/

}
