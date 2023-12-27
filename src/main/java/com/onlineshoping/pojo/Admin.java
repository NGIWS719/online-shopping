package com.onlineshoping.pojo;

public class Admin {
    private long id;
    private String nickName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getnickName() {
        return nickName;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public Admin(long id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Admin() {

    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
