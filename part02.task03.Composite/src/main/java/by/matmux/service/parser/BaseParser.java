package by.matmux.service.parser;

import by.matmux.bean.TextComposite;

public abstract class BaseParser implements CommonParser {
    /** Next parser in the chain. */
    private BaseParser next;

    /** Adds parser in the chain.
     * @param next parser to add
     * @return next parser
     */
    public BaseParser linkWith(final BaseParser next) {
        this.next = next;
        return next;
    }
    /**
     * Calls the next parser in the chain.
     * @param text
     * @return calling the parser method
     */
    protected boolean parserNext(final String text, final TextComposite composite) {
        if (next == null || text.equals("")) {
            return false;
        }
        return next.parser(text, composite);
    }
}
