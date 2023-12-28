package com.onlineshoping.config;

import com.onlineshoping.interceptor.LoginInterceptor;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Resource
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor).excludePathPatterns("/user/login","/user/register");
        registry.addInterceptor(loginInterceptor).excludePathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
