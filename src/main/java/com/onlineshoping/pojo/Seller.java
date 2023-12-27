package com.onlineshoping.pojo;


//商家表
public class Seller {
    private long id;
    private String nickName;
    private String name;
    private String telephone;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Seller(long id, String nickName, String name, String telephone, String password) {
        this.id = id;
        this.nickName = nickName;
        this.name = name;
        this.telephone = telephone;
        this.password = password;
    }

    public Seller() {

    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
