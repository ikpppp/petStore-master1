package com.chilun.petStore.pojo;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2022-10-26-15:51
 * 购物车类
 */
public class Cart {
    private int userID;
    private List<CartItem> items;
    private float totalPrice;

    public Cart() {
    }
}
