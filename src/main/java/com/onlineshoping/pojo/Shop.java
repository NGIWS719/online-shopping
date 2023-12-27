package com.onlineshoping.pojo;

//店铺表
public class Shop {
    private long id;
    private String name;
    private String description;
    private long sellerId;
    private String location;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Shop(long id, String name, String description, long sellerId, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sellerId = sellerId;
        this.location = location;
    }

    public Shop() {

    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sellerId=" + sellerId +
                ", location='" + location + '\'' +
                '}';
    }
}
