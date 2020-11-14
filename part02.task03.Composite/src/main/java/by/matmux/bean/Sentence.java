package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends BaseText {
    /** Contains sentence lexemes. */
    private final List<Lexeme> lexemeList = new ArrayList<>();
    public Sentence(final String value) {
        super(value);
    }

    /**
     * Adds lexeme in the list.
     * @param lexeme - lexeme to add
     */
    public void addLexeme(final Lexeme lexeme) {
        lexemeList.add(lexeme);
    }
    public List<Lexeme> getLexemeList() {
        return lexemeList;
    }
}
