package by.matmux.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

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

        StringBuilder resultStr = new StringBuilder();
        String[] tmpArr = text.trim().split("[ ,.;:]");
        ArrayList<StringBuilder> listOfWord = new ArrayList<>();

        for (String s : tmpArr) { listOfWord.add(new StringBuilder(s)); }

        HashMap<Integer, Character> mapOfPunctuationMark = new HashMap<>();
        HashSet<Character> setOfSeparator = new HashSet<>();
        Stream.of(',', '.', ':', ';').forEach(setOfSeparator::add);

        for (int i = 0; i < text.length(); i++) {
            if (setOfSeparator.contains(text.charAt(i))) { mapOfPunctuationMark.put(i, text.charAt(i)); }
        }

        listOfWord.stream().filter(s -> s.length() > k).map(s -> s.replace(k - 1, k, ch)).
                forEach(s -> s.append(""));

        listOfWord.stream().forEach(s-> resultStr.append(s + " "));

        for (int i = 0; i < text.length(); i++) {
            if (resultStr.charAt(i) == ' ' && mapOfPunctuationMark.containsKey(i)) {
                    resultStr.insert(i, mapOfPunctuationMark.get(i));
                    resultStr.deleteCharAt(i+1);
            }
        }

        return resultStr.toString();
    }
}
