package by.matmux.service;

public class RemoveAllExceptLetter {
    /**
     * deleting all char except letter and double spaces
     * @param text - the test
     * @return modified text
     */
    public String remove(final String text) {
        if (text == null || "".equals(text)) { return ""; }

        return text.replaceAll("\\p{Punct}", "")
                .replaceAll("\\s{2,}", " ");
    }
}
