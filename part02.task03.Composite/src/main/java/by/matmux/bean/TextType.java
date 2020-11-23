package by.matmux.bean;

public enum TextType {
    /** Text types containing regular expressions. */
    TEXT("(\\t.+)", "\n"),
    PARAGRAPH("([ \\w\\&\\>\\<\\)\\(\\|\\~\\^\\,\\-\\'\\\"]+[.\\!\\?])", ""),
    SENTENCE("([^\\s]+)", " "),
    LEXEME("([^\\s]*[\\w)(])", ""), WORD("([\\w])", ""),
    PUNCTUATION("([^\\s\\w]*[\\p{Punct}])"/*"([^\\s\\w)']*[.,])"*/, "");

    /** Regular expression. */
    private String regexp;

    /** Separator. */
    private String separator;

    TextType(final String regexp, final String separator) {
        this.regexp = regexp;
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }

    public String getRegexp() {
        return regexp;
    }
}
