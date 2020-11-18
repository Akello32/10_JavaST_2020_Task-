package by.matmux.service.query;

import by.matmux.bean.PartsText;

import java.util.List;

public interface Query {
    List<PartsText> sort(String text);
}
