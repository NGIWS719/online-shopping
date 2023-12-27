package com.onlineshoping.util;

import cn.hutool.json.JSONUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.onlineshoping.dto.TokenDto;
import com.onlineshoping.pojo.Admin;
import com.onlineshoping.pojo.Seller;
import com.onlineshoping.pojo.User;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyJWTUtil {

    public static final String JWT_PASSWORD="yjcxwcxt";
    public static final long EXPIRE_TIME=1000 * 60 * 60 * 24 * 15;
    public static String createJwtByUser(User user){
        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("userId",user.getId());
                put("nickName", user.getNickName());
                put("expire_time", System.currentTimeMillis() + EXPIRE_TIME);
            }
        };
        String token = JWTUtil.createToken(map, JWT_PASSWORD.getBytes());
//        TokenDto tokendto = new TokenDto();
//        tokendto.setToken(token);
        return token;
    }
    public static String createJwtBySeller(Seller seller){
        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("sellerId",seller.getId());
                put("nickName", seller.getNickName());
                put("expire_time", System.currentTimeMillis() + EXPIRE_TIME);
            }
        };
        String token = JWTUtil.createToken(map, JWT_PASSWORD.getBytes());
//        TokenDto tokendto = new TokenDto();
//        tokendto.setToken(token);
        return token;
    }
    public static String createJwtByAdmin(Admin admin){
        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("adminId",admin.getId());
                put("nickName", admin.getNickName());
                put("expire_time", System.currentTimeMillis() + EXPIRE_TIME);
            }
        };
        String token = JWTUtil.createToken(map, JWT_PASSWORD.getBytes());
//        TokenDto tokendto = new TokenDto();
//        tokendto.setToken(token);
        return token;
    }
    public static boolean deleteJwt(HttpServletRequest request){

        return true;
    }
    public static boolean checkJwt(String token,HttpServletRequest request){
        String token1 = request.getHeader("token");
        if(token1==null){
            return false;
        }
        boolean verify = JWTUtil.verify(token, JWT_PASSWORD.getBytes());
        JWT jwt = JWTUtil.parseToken(token);
        long expireTime = Long.valueOf(String.valueOf(jwt.getPayload("expire_time")));
        boolean flag = !((System.currentTimeMillis()-expireTime)>EXPIRE_TIME) ;
        return verify && flag;
    }
    public static long jwtGetUserId(HttpServletRequest request){
        JWT jwt = JWTUtil.parseToken(request.getHeader("token"));
        long userId = Long.valueOf(String.valueOf(jwt.getPayload("userId")));
        return userId;
    }
    public static long jwtGetSellerId(HttpServletRequest request){
        JWT jwt = JWTUtil.parseToken(request.getHeader("token"));
        long sellerId = Long.valueOf(String.valueOf(jwt.getPayload("sellerId")));
        return sellerId;
    }
    public static  long jwtGetAdminId(HttpServletRequest request){
        JWT jwt = JWTUtil.parseToken(request.getHeader("token"));
        long sellerId = Long.valueOf(String.valueOf(jwt.getPayload("adminId")));
        return sellerId;
    }

}
