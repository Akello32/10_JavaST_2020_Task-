package by.matmux.service;

public class DeletingWords {
    /**
     * deletes every word of the specified length that starts with a consonant
     * @param text - the text
     * @param lengthWords - the length of the words that need to be deleted
     * @return modified text
     */
    public String delete(final String text, final int lengthWords) {
        if (text == null || "".equals(text)) { return ""; }
        String[] tmpArr = text.trim().split("[\\p{Punct}\\d\\s]");
        StringBuilder result = new StringBuilder(text);

        for (String s : tmpArr) {
            if (s.length() == lengthWords) {
                if (s.matches("^(?ui:[бфгджзйклмнпрстхцчщш]).*")
                        || s.matches("^(?i:[bcdfghjlkmnpqrstvwxz]).*")) {
                    int index = result.indexOf(s);
                    result.replace(index, index + s.length(), "");
                }
            }
        }

        return result.toString();
    }
}
