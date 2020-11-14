package by.matmux.service.parser;

import by.matmux.bean.Paragraph;
import by.matmux.bean.Sentence;
import by.matmux.bean.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {
    /** Logger. */
    private static final Logger log = LogManager.getLogger(SentenceParser.class);

    /**
     * Parses paragraphs into sentences.
     * @param list - the list of paragraphs to parser
     */
    public void parser(final List<Paragraph> list) {
        if (list == null || list.isEmpty()) {
            log.debug("Null object");
            return;
        }
        Pattern pattern = Pattern.compile("(\\t.+)");

        for (Paragraph p : list) {
            Matcher matcher = pattern.matcher(p.getValue());

        }
    }
}
