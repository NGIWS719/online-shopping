package com.onlineshoping.dto;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

public class TokenDto {
    private String token;

    // 构造函数
    public TokenDto() {};
    public TokenDto(String token) {
        this.token = token;
    }

    // Getter 和 Setter 方法
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public TokenDto toJson(String tokenJson) {
        TokenDto tokenDto = new TokenDto(tokenJson);
        return tokenDto;
    }
}
