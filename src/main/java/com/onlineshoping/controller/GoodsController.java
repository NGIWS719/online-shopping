package com.onlineshoping.controller;

import com.onlineshoping.dto.Result;
import com.onlineshoping.service.IGoodsService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods/")
public class GoodsController {
    @Resource
    IGoodsService goodsService;
    @GetMapping("get_goods")
    public Result getGoods(HttpServletRequest request) {
        return goodsService.getGoods(request);
    }


    @GetMapping("search")
    public Result searchGoods(HttpServletRequest request){
        return goodsService.searchGoods(request);
    }
}
