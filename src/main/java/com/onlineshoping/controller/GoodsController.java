package com.onlineshoping.controller;

import com.onlineshoping.dto.Result;
import com.onlineshoping.service.IGoodsService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")   // 解决跨域问题
public class GoodsController {
    @Resource
    IGoodsService goodsService;
    @GetMapping("/get_goods")
    public Result getGoods(HttpServletRequest request) {
        return goodsService.getGoods(request);
    }
}
