package com.onlineshoping.pojo;

//地址信息表

public class Address {
    private long id;
    private String name;
    private String telephone;
    private String location;
    private char defaultLocation;
    private long userId;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public char getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(char defaultLocation) {
        this.defaultLocation = defaultLocation;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Address(long id, String name, String telephone, String location,  char defaultLocation, long userId) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.location = location;
        this.defaultLocation = defaultLocation;
        this.userId = userId;
    }

    public Address() {

    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", location='" + location + '\'' +
                ", defaultLocation=" + defaultLocation +
                ", userId=" + userId +
                '}';
    }
}
