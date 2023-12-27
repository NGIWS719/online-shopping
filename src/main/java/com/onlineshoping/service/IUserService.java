package com.onlineshoping.service;

import com.onlineshoping.dto.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {


    public Result userRegister(HttpServletRequest request);
    public Result userLogin(HttpServletRequest request);

    public Result userInfo(HttpServletRequest request);
    public Result userLogout(HttpServletRequest request);
}
