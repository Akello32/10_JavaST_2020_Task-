package by.matmux.service;

public class MistakeChange {
    /**
     * Correction of an error in a word by the previous missing letter and the correct letter
     * @param word - misspelled word
     * @param prevLetter - letter before the mistake
     * @param desLetter - the correct letter
     * @param text the text
     * @return modified text
     */
    public String changingAnMistake(final String word, final String prevLetter,
                                           final String desLetter, final  String text) {
        if (text == null || "".equals(text)) { return ""; }
        if (word == null || "".equals(word)) { return text; }
        if (prevLetter == null || desLetter == null || "".equals(prevLetter) || "".equals(desLetter)) {
            return text;
        }
        StringBuilder correctWord = new StringBuilder(word);
        correctWord.replace(correctWord.indexOf(prevLetter) + 1, correctWord.indexOf(prevLetter) + 2, desLetter);

        return text.replaceAll(word, String.valueOf(correctWord));
    }
}
