/**
 * This class was created for storing buckets
 */

package by.matmux.bean;

import java.util.ArrayList;

public final class BasketList {
    private final ArrayList<Basket> listOfBasket = new ArrayList<>();

    public int getSizeList() {
        return listOfBasket.size();
    }

    public Basket getBasket(final int i) {
        if (i > listOfBasket.size() || i < 0) {  }

        return listOfBasket.get(i);
    }

    public void addBasketInToList(final Basket basket) {
        listOfBasket.add(basket);
    }
}
