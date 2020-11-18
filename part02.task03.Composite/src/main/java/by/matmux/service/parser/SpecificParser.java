package by.matmux.service.parser;

import by.matmux.bean.PartsText;
import by.matmux.bean.TextAction;
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
    public PartsText parser(final String text) {
        if (text == null || text.equals("")) {
            log.debug("Null object");
            return new PartsText(" ", type);
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        PartsText result = new PartsText(text, type);
        while (matcher.find()) {
            result.add(new PartsText(matcher.group(), nextType));
        }
        for (PartsText p : result.getParts()) {
            p.add(parserNext(p.getValue()));
        }
        return result;
    }
}
