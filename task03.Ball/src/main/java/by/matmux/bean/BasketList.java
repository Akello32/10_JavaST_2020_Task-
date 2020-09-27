package by.matmux.bean;

import java.util.ArrayList;

public class BasketList {
    private ArrayList<Basket> basketList = new ArrayList<>();

    public int getSizeList() {
        return basketList.size();
    }

    public Basket getBasket(final int i) {
        return basketList.get(i);
    }

    public void addBasketInToList(final Basket basket) { basketList.add(basket); }

    public ArrayList<Basket> getBasketList() {
        return basketList;
    }
}
