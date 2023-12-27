package com.onlineshoping.controller;


import com.onlineshoping.dto.Result;
import com.onlineshoping.service.IUserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    IUserService userService;
    @PostMapping("register")
    public Result userRegister(HttpServletRequest request){
        return userService.userRegister(request);
    }
    @PostMapping("login")
    public Result userLogin(HttpServletRequest request){
        return userService.userLogin(request);
    }
    @GetMapping("profile")
    public Result userInfo(HttpServletRequest request){
        return userService.userInfo(request);
    }
    @PostMapping("/logout")
    public Result logout(HttpServletRequest request){
        // TODO 实现登出功能
        return userService.userLogout(request);
    }
}
