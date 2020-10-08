package by.matmux.service.jaggedarraysmethod;

public final class JaggedArrayFactory {
    private static final JaggedArrayFactory instance = new JaggedArrayFactory();

    AdditionJaggedArr additionJaggedArr = new AdditionJaggedArr();
    CheckSquare checkSquare = new CheckSquare();
    MultiplicationArr multiplicationArr = new MultiplicationArr();
    SortJaggedArray sortJaggedArray = new SortJaggedArray();
    SubtractionJaggedArr subtractionJaggedArr = new SubtractionJaggedArr();
    TranspositionArray transpositionArray = new TranspositionArray();

    public static JaggedArrayFactory getInstance() {
        return instance;
    }

    public AdditionJaggedArr getAdditionJaggedArr() {
        return additionJaggedArr;
    }

    public CheckSquare getCheckSquare() {
        return checkSquare;
    }

    public MultiplicationArr getMultiplicationArr() {
        return multiplicationArr;
    }

    public SortJaggedArray getSortJaggedArray() {
        return sortJaggedArray;
    }

    public SubtractionJaggedArr getSubtractionJaggedArr() {
        return subtractionJaggedArr;
    }

    public TranspositionArray getTranspositionArray() {
        return transpositionArray;
    }
}
