package by.matmux.service.parser;

import by.matmux.bean.Paragraph;
import by.matmux.bean.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(ParagraphParser.class);

    /**
     * Parses text into paragraphs.
     * @param text text to parser
     */
    public void parser(final Text text) {
        if (text == null || text.getValue().equals("")) {
            log.debug("Null object");
            return;
        }
        Pattern pattern = Pattern.compile("(\\t.+)");
        Matcher matcher = pattern.matcher(text.getValue());

        while (matcher.find()) {
            String tmp = matcher.group();
            text.addParagraph(new Paragraph(tmp));
        }
    }
}
