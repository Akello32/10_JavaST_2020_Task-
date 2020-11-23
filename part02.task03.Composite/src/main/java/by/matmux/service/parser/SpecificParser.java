package by.matmux.service.parser;

import by.matmux.bean.PartsText;
import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecificParser extends BaseParser {
    /** Regular expression. */
    private String regex;
    /** The type of the current text. */
    private TextType type;
    /** The type of the received part of the text. */
    private TextType nextType;

    /** Logger. */
    private static final Logger log = LogManager.getLogger(SpecificParser.class);

    public SpecificParser(final TextType textType, final TextType nextType) {
        this.regex = textType.getRegexp();
        this.type = textType;
        this.nextType = nextType;
    }

    /**
     * Parses text into parts.
     * @param text text to parser
     * @return Result of parsing
     */
    @Override
    public boolean parser(final String text, final TextComposite result) {
        if (text == null || text.equals("")) {
            log.debug("Null object");
            return false;
        }

        Pattern patternPunct = Pattern.compile(TextType.PUNCTUATION.getRegexp());
        Matcher matcherPunct = patternPunct.matcher(text);
        boolean punct = false;
        if (type == TextType.LEXEME) {
            punct = true;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.addText(new PartsText(matcher.group(), nextType));
        }
        if (punct) {
            while (matcherPunct.find()) {
                result.addText(new PartsText(matcherPunct.group(), TextType.PUNCTUATION));
            }
        }
        for (TextComposite p : result.getParts()) {
            parserNext(p.toString(), p);
        }

        return true;
    }
}
