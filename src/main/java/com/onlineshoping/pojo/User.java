package com.onlineshoping.pojo;

//用户表
public class User {
    private Long id;
    private String nickname;
    private String name;
    private String telephone;
    private String password;

    public User(){

    }
    public User(Long id, String nickname, String name, String telephone, String password) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.telephone = telephone;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickName) {
        this.nickname = nickName;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
