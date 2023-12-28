package com.onlineshoping.pojo;

//购物车表
public class ShoppingCart {
    private long id;
    private long goodsId;
    private long userId;
    private int number;

    public long getId() {
        return id;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ShoppingCart(long id, long goodsId, long userId, int number) {
        this.id = id;
        this.goodsId = goodsId;
        this.userId = userId;
        this.number = number;
    }
    public ShoppingCart() {

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ShoppingCart{" +
                "goodsId=" + goodsId +
                ", userId=" + userId +
                ", number=" + number +
                '}';
    }
}
