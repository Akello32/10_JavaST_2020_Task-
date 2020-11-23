package by.matmux.bean;

import java.util.List;

public interface TextComposite {
    void addText(TextComposite text);

    List<TextComposite> getParts();

    String getValue();
}
