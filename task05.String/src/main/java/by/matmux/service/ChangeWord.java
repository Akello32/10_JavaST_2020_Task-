package by.matmux.service;

public class ChangeWord {
    /**
     * replacing all words of the specified length with the specified substring
     * @param text - text
     * @param lengthWord - the length of the words that need to be replaced
     * @param newWord - substring
     * @return modified string
     */
    public String changeWord(final String text, final int lengthWord, final String newWord) {
        if (text == null || "".equals(text)) { return ""; }
        if (lengthWord == 0) { return text; }
        if (newWord == null || "".equals(newWord)) { return text; }

        StringBuilder resultStr = new StringBuilder(text);
        String[] tmpArr = text.trim().split("[\\p{Punct}d\\s]");

        for (String s : tmpArr) {
            if (s.length() == lengthWord) {
                int index = resultStr.indexOf(s);
                resultStr.replace(index, index + s.length(), newWord);
            }
        }

        return resultStr.toString();
    }
}
