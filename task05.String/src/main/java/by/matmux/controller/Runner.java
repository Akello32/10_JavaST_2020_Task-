package by.matmux.controller;

import by.matmux.service.ChangeChar;

public class Runner {
    public static void main(String[] args) {
        ChangeChar changeChar = new ChangeChar();
        String str = "по программе, микрофон я: поправленный пивком";
        System.out.println(changeChar.changeChar(4, "к", str));
    }
}
