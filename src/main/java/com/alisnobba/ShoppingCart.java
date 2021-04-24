package com.alisnobba;

public class ShoppingCart {
    private  int subtotalPrice = 8;
    private boolean shoppingCartEmptyStatus = false;



    public boolean isShoppingCartEmpty() {
        return shoppingCartEmptyStatus;
    }

    public int getPriceSubTotal() {

        return subtotalPrice;
    }
}
