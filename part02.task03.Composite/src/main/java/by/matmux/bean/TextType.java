package by.matmux.bean;

public enum TextType {
    /** Text types containing regular expressions. */
    TEXT("(\\t.+)"), PARAGRAPH("([ \\w\\&\\>\\<\\)\\(\\|\\~\\^\\,\\-\\'\\\"]+[.\\!\\?])"),
    SENTENCE("([^\\s]+)"), LEXEME("([^\\s]*[\\w)])"), WORD(""),
    PUNCTUATION(/*"([^\\s\\w]*[\\p{Punct}])"*/"([^\\s\\w)']*[.,])");

    /** Regular expression. */
    private String regexp;

    TextType(final String regexp) {
        this.regexp = regexp;
    }

    public String getRegexp() {
        return regexp;
    }
}
