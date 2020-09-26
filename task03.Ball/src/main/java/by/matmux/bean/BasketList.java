package by.matmux.bean;

import java.util.ArrayList;

public class BasketList {
    private ArrayList<Basket> basketList = new ArrayList<>();

    public BasketList () {
        basketList.add(new Basket());
    }

    public void addBasketInToList(final Basket basket) { basketList.add(basket); }

    public ArrayList<Basket> getBasketList() {
        return basketList;
    }
}
