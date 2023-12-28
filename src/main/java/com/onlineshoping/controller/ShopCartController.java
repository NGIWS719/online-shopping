package com.onlineshoping.controller;


import com.onlineshoping.dto.Result;
import com.onlineshoping.service.IShopCartService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop_cart/")
public class ShopCartController {
    @Resource
    IShopCartService shopCartService;

    @GetMapping("get")
    public Result selectShopCartByUserId(HttpServletRequest request){
//        获取用户id
        String userId = request.getParameter("userId");
        long id = Long.parseLong(userId);
        return shopCartService.selectListShopCart(id);
    }

    @PutMapping("add")
    public Result addGoodsToShopCart(HttpServletRequest request){
        return shopCartService.addGoods(request);
    }

    //删除购物车中的一件商品
    @GetMapping("delete")
    public Result removeGoodsShopCart(HttpServletRequest request){
        return shopCartService.removeGoods(request);
    }

    //删除购物车中的一种商品
    @GetMapping("deletes")
    public Result removesGoodsShopCart(HttpServletRequest request){
        return shopCartService.removesGoods(request);
    }

    @GetMapping("/clear")
    Result clearShopCart(HttpServletRequest request){
        return shopCartService.clearCart(request);
    }
    @GetMapping
    Result priceCount (HttpServletRequest request){
        return shopCartService.priceCount(request);
    }
}
