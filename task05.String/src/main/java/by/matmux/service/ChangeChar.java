package by.matmux.service;

public class ChangeChar {
    /**
     * In each word, the k-th letter is replaced with the specified character.
     * If k is longer than the word length, no correction is performed.
     * @param k - the position of the letter
     * @param ch - specified character
     * @param text
     * @return modified text
     */
    public String changeChar(final int k, final String ch, final String text) {
        if (text == null || "".equals(text)) { return ""; }
        if (ch == null || "".equals(ch)) { return text; }

        StringBuilder resultStr = new StringBuilder(text);
        String[] tmpArr = text.trim().split("[\\p{Punct}\\d\\s]");

        for (String s : tmpArr) {
            if (s.length() > k) {
                int index = resultStr.indexOf(s);
                resultStr.replace(index + k - 1, index + k, ch);
            }
        }

        return resultStr.toString();
    }
}
