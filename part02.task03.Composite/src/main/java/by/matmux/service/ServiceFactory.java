package by.matmux.service;

import by.matmux.service.query.SortLexemeQuery;
import by.matmux.service.query.SortParagraphQuery;
import by.matmux.service.query.SortWordQuery;

public final class ServiceFactory {
    private final static ServiceFactory instance = new ServiceFactory();

    private final SortLexemeQuery lexemeQuery = new SortLexemeQuery();
    private final SortWordQuery wordQuery = new SortWordQuery();
    private final SortParagraphQuery paragraphQuery = new SortParagraphQuery();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public SortLexemeQuery getLexemeQuery() {
        return lexemeQuery;
    }

    public SortWordQuery getWordQuery() {
        return wordQuery;
    }

    public SortParagraphQuery getParagraphQuery() {
        return paragraphQuery;
    }
}
