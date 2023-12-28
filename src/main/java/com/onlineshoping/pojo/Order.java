package com.onlineshoping.pojo;

import java.sql.Timestamp;

//订单表
public class Order {
    private long id;
    private long goodsId;
    private long userId;
    private long userAddressId;
    private long shopId;
    private long expressCompanyId;
    private String deliveryLocation;
    private String userLocation;
    private Timestamp time;
    private char status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(long userAddressId) {
        this.userAddressId = userAddressId;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public long getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(long expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Order(long id, long goodsId, long userId, long userAddressId, long shopId, long expressCompanyId, String deliveryLocation, String userLocation, Timestamp time, char status) {
        this.id = id;
        this.goodsId = goodsId;
        this.userId = userId;
        this.userAddressId = userAddressId;
        this.shopId = shopId;
        this.expressCompanyId = expressCompanyId;
        this.deliveryLocation = deliveryLocation;
        this.userLocation = userLocation;
        this.time = time;
        this.status = status;
    }

    public Order(){

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", userId=" + userId +
                ", userAddressId=" + userAddressId +
                ", shopId=" + shopId +
                ", expressCompanyId=" + expressCompanyId +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", userLocation='" + userLocation + '\'' +
                ", datetime=" + time +
                ", status=" + status +
                '}';
    }
}
