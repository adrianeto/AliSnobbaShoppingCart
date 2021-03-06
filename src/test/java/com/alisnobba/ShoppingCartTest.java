package com.alisnobba;

import com.alisnobba.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShoppingCartTest {
    @Test
    void testEmptyShoppingCart(){
        //setup
        ShoppingCart myCart = new ShoppingCart();
        //execution
        boolean expected = false;
        boolean actual = myCart.isShoppingCartEmpty();

        //assert
        assertEquals(expected, actual);
    }
    @Test
    void testPriceSubtotalInCart(){
        //setup
        ShoppingCart myCart = new ShoppingCart();
        //exec
        int expectedTotalPrice = 8;
        int actualTotalPrice = myCart.getPriceSubTotal();

        //assert
        assertEquals(expectedTotalPrice,actualTotalPrice );
    }


}
