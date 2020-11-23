package by.matmux.dao;

import by.matmux.bean.PartsText;
import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.service.SetTextFromFile;

public class TextRepository implements Repository {
    private static final TextComposite text = new PartsText(SetTextFromFile.set(), TextType.TEXT);

    private TextRepository() {}

    public static TextComposite getComposite() {
        return text;
    }

    @Override
    public String query() {
        return null;
    }
}
