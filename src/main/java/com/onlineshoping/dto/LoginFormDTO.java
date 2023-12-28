package com.onlineshoping.dto;

public class LoginFormDTO {
    private String nickName;
    private String telephone;
    private String password;
    private String code;

    public LoginFormDTO() {
    }

    public LoginFormDTO(String nickName, String telephone, String password, String code) {
        this.nickName = nickName;
        this.telephone = telephone;
        this.password = password;
        this.code = code;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LoginFormDTO{" +
                "nickName='" + nickName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
