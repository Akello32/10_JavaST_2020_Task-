package by.matmux.dao;

import by.matmux.bean.TextComposite;

public interface Repository {
    void setText();
    String query();
    TextComposite getComposite();
}
