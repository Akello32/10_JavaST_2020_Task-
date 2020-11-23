package by.matmux.dao;

import by.matmux.bean.PartsText;
import by.matmux.bean.TextComposite;
import by.matmux.bean.TextType;
import by.matmux.service.SetTextFromFile;

public class TextRepository implements Repository {
    TextComposite text;

    @Override
    public void setText() {
        text = new PartsText(SetTextFromFile.set(), TextType.TEXT);
    }

    @Override
    public TextComposite getComposite() {
        return text;
    }

    @Override
    public String query() {
        return null;
    }
}
