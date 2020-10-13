package by.matmux.service;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ChangeWord changeWord = new ChangeWord();
    private final ChangeChar changeChar = new ChangeChar();
    private final DeletingWords deletingWords = new DeletingWords();
    private final MistakeChange mistakeChange = new MistakeChange();
    private final RemoveAllExceptLetter remove = new RemoveAllExceptLetter();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ChangeWord getChangeWord() {
        return changeWord;
    }

    public ChangeChar getChangeChar() {
        return changeChar;
    }

    public DeletingWords getDeletingWords() {
        return deletingWords;
    }

    public MistakeChange getMistakeChange() {
        return mistakeChange;
    }

    public RemoveAllExceptLetter getRemove() {
        return remove;
    }
}
