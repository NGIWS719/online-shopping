package com.onlineshoping.pojo;

//商品
public class Goods {
    private long id;
    private String name;
    private double price;
    private String description;
    private long shopId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public Goods(long id, String name, double price, String description, long shopId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.shopId = shopId;
    }

    public Goods() {

    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", shopId=" + shopId +
                '}';
    }
}
