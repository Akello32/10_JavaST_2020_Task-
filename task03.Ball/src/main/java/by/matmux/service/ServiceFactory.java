package by.matmux.service;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final BasketFiller basketFiller = new BasketFiller();
    private final CheckBasketEqual checkBasketEqual = new CheckBasketEqual();
    private final CheckEqualityBall checkEqualityBall = new CheckEqualityBall();
    private final CheckQuantityColor checkQuantityColor = new CheckQuantityColor();
    private final CheckWeight checkWeight = new CheckWeight();
    private final OutputToCost outputToCost = new OutputToCost();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public BasketFiller getBasketFiller() {
        return basketFiller;
    }

    public CheckBasketEqual getCheckBasketEqual() {
        return checkBasketEqual;
    }

    public CheckEqualityBall getCheckEqualityBall() {
        return checkEqualityBall;
    }

    public CheckQuantityColor getCheckQuantityColor() {
        return checkQuantityColor;
    }

    public CheckWeight getCheckWeight() {
        return checkWeight;
    }

    public OutputToCost getOutputToCost() {
        return outputToCost;
    }
}
