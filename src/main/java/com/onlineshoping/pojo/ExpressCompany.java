package com.onlineshoping.pojo;

//快递公司表
public class ExpressCompany {
    private long id;
    private String name;

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

    public ExpressCompany(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ExpressCompany() {

    }

    @Override
    public String toString() {
        return "ExpressCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
