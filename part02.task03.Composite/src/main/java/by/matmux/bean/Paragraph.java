package by.matmux.bean;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends BaseText {
    private final List<Sentence> sentenceList = new ArrayList<>();

    public Paragraph(final String value) {
        super(value);
    }

    public void addSentence(final Sentence sentence) {
        sentenceList.add(sentence);
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }
}
