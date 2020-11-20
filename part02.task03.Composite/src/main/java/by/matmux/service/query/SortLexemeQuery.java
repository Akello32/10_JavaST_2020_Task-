package by.matmux.service.query;

import by.matmux.bean.TextType;
import by.matmux.service.parser.BaseParser;
import by.matmux.service.parser.SpecificParser;

public class SortLexemeQuery implements Query{
    @Override
    public String sort(String text) {
        BaseParser parser = new SpecificParser(TextType.TEXT, TextType.PARAGRAPH);
        parser.linkWith(new SpecificParser(TextType.PARAGRAPH ,TextType.SENTENCE)).
                linkWith(new SpecificParser(TextType.SENTENCE, TextType.LEXEME)).
                linkWith(new SpecificParser(TextType.LEXEME, TextType.WORD)).
                linkWith(new SpecificParser(TextType.WORD, TextType.WORD));

        return null;
    }
}
