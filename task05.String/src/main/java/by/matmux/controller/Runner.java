package by.matmux.controller;

import by.matmux.service.*;

public class Runner {
    public static void main(String[] args) {
        ChangeChar changeChar = new ChangeChar();
        MistakeChange mistakeChange = new MistakeChange();
        ChangeWord changeWord = new ChangeWord();
        RemoveAllExceptLetter rem = new RemoveAllExceptLetter();
        DeletingWords deletingWords = new DeletingWords();

        String str = "По программе микрофон, я \"поправленный певкооом\", ddigital времячко действия челябинск! 21 век ";
        System.out.println(mistakeChange.changingAnMistake("программе", "м", "f", str));
        System.out.println(changeChar.changeChar(1, "W", str));
        System.out.println(changeWord.changeWord(str, 8, "триагрутрика"));
        System.out.println(rem.remove(str));
        System.out.println(deletingWords.delete(str, 8));
    }
}


