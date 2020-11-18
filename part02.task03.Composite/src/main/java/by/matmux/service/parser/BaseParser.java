package by.matmux.service.parser;

import by.matmux.bean.PartsText;

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
    protected PartsText parserNext(final String text) {
        if (next == null || text.equals("")) {
            return null;
        }
        return next.parser(text);
    }
}
