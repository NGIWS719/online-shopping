package com.onlineshoping.service.imp;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.onlineshoping.dto.Result;
import com.onlineshoping.dto.TokenDto;
import com.onlineshoping.mapper.UserMapper;
import com.onlineshoping.pojo.User;
import com.onlineshoping.service.IUserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;


import static com.onlineshoping.util.MyJWTUtil.*;
import static com.onlineshoping.util.RegexUtil.isPasswordInvalid;
import static com.onlineshoping.util.RegexUtil.isPhoneInvalid;

@Service
public class UserServiceIml implements IUserService {
    @Resource
    UserMapper userMapper;
    @Override
    public Result userInfo(HttpServletRequest request) {
        String token = request.getHeader("token");
        final JWT jwt = JWTUtil.parseToken(token);
        long id =Long.parseLong(String.valueOf(jwt.getPayload("userId")));
        String nickName = (String) jwt.getPayload("nickName");
        User user = new User();
        user.setId(id);
        user.setNickName(nickName);
        return Result.ok(user);
    }

    @Override
    public Result userLogout(HttpServletRequest request) {
        request.getHeader("token");
        return null;
    }

    @Override
    public Result userRegister(HttpServletRequest request) {
        String phone = request.getParameter("telephone");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");
//        if(isPhoneInvalid(phone)){
//            return Result.fail("手机号格式错误");
//        }
        if(isPasswordInvalid(password)){
            return Result.fail("密码格式错误");
        }
        User user = userMapper.SelectByTelephone(phone);
        if(user==null){
            user = new User();
            user.setNickName(nickname);
            user.setTelephone(phone);
            user.setPassword(password);
            userMapper.InsertUser(user);
            return Result.ok(new TokenDto(createJwtByUser(user)));
        }
        return Result.fail("用户已存在");
    }
    @Override
    public Result userLogin(HttpServletRequest request) {
        String telephone = request.getParameter("telephone");
        String password = request.getParameter("password");
        if(telephone==null||password==null){
            return Result.fail("账号或密码为空");
        }
        User user = userMapper.checkLoginByPhonePwd(telephone,password);
        if(user==null){
            return Result.fail("账号或密码错误");
        }
        return Result.ok(createJwtByUser(user));
    }

}
