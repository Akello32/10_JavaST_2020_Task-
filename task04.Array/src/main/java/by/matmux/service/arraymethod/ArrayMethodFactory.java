package by.matmux.service.arraymethod;

public final class ArrayMethodFactory {
    private static final ArrayMethodFactory instance = new ArrayMethodFactory();

    BinarySearch binarySearch = new BinarySearch();
    FibonachiNumbers fibonachiNumbers = new FibonachiNumbers();
    FindByValue findByValue = new FindByValue();
    FindMax findMax = new FindMax();
    FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
    FindThreeDigit findThreeDigit = new FindThreeDigit();
    SetArrFormRandom setArrFormRandom = new SetArrFormRandom();
    SetArrFromFiles setArrFromFiles = new SetArrFromFiles();
    Sort sort = new Sort();
    FindMin findMin = new FindMin();

    public FindMin getFindMin() { return findMin; }

    public static ArrayMethodFactory getInstance() {
        return instance;
    }

    public BinarySearch getBinarySearch() {
        return binarySearch;
    }

    public FibonachiNumbers getFibonachiNumbers() {
        return fibonachiNumbers;
    }

    public FindByValue getFindByValue() {
        return findByValue;
    }

    public FindMax getFindMax() {
        return findMax;
    }

    public FindPrimeNumber getFindPrimeNumber() {
        return findPrimeNumber;
    }

    public FindThreeDigit getFindThreeDigit() {
        return findThreeDigit;
    }

    public SetArrFormRandom getSetArrFormRandom() {
        return setArrFormRandom;
    }

    public SetArrFromFiles getSetArrFromFiles() {
        return setArrFromFiles;
    }

    public Sort getSort() {
        return sort;
    }
}
