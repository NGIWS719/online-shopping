package com.onlineshoping.service.imp;


import com.onlineshoping.dto.Result;
import com.onlineshoping.mapper.GoodsMapper;
import com.onlineshoping.mapper.ShoppingCartMapper;
import com.onlineshoping.pojo.ShoppingCart;
import com.onlineshoping.service.IShopCartService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.onlineshoping.util.MyJWTUtil.jwtGetUserId;

@Service
public class ShopCartService implements IShopCartService {


    final Integer ZERO=0;
    @Resource
    GoodsMapper goodsMapper;
    @Resource
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public Result selectListShopCart(long id) {
        List<ShoppingCart> shoppingCarts = shoppingCartMapper.SelectShopCartById(id);
        if(shoppingCarts.isEmpty()){
            return Result.ok();
        }
        //存放购物车物品及数量
        Map<Long,Integer> map = new HashMap<>();
        for(ShoppingCart shoppingCart : shoppingCarts){
            Long GoodsId =shoppingCart.getGoodsId();
            Integer number = shoppingCart.getNumber();
            map.put(GoodsId,number);
        }

        return Result.ok(shoppingCarts,shoppingCarts.stream().count());
    }

    @Override
    public Result addGoods(HttpServletRequest request) {
        String goodsIdTemp = request.getParameter("goodsId");
        String id = request.getParameter("id");
        long cartId = Long.valueOf(id);
        long goodsId = Long.valueOf(goodsIdTemp);
        long userId =jwtGetUserId(request);
        int number =Integer.valueOf(request.getParameter("number"));
        if(shoppingCartMapper.SelectUserGoods(goodsId,userId)==null){
            ShoppingCart shoppingCart = new ShoppingCart(cartId, goodsId,userId,1);
            shoppingCartMapper.InsertItem(shoppingCart);
        }else {
            shoppingCartMapper.AddItemNumber(userId,goodsId,number);
        }
        return Result.ok();
    }

    @Override
    public Result clearCart(HttpServletRequest request) {
        String token = request.getHeader("token");
        long userId = jwtGetUserId(request);
        shoppingCartMapper.DeleteShoppingCart(userId);


        return Result.ok();
    }

    @Override
    public Result priceCount(HttpServletRequest request) {

        List<ShoppingCart> shoppingCarts = shoppingCartMapper.SelectShopCartById(jwtGetUserId(request));
        double sumPrice=ZERO;
        if(shoppingCarts!=null){
            sumPrice = shoppingCartMapper.PrintSumPrice(jwtGetUserId(request));
        }
        return Result.ok(sumPrice);
    }

    //减少一个购物车商品
    @Override
    public Result removeGoods(HttpServletRequest request) {
        String goodsIdTemp = request.getParameter("goodsId");
        long goodsId = Long.valueOf(goodsIdTemp);
        long userId=Long.valueOf(request.getParameter("userId"));
//        long userId = jwtGetUserId();
        if(shoppingCartMapper.SubtractItemNumber(userId,goodsId)==ZERO){
            return Result.fail("该商品已不在购物车");
        };
        ShoppingCart shoppingCart = shoppingCartMapper.SelectShopCartByIdGoodsId(userId, goodsId);
        if(shoppingCart.getNumber()<=ZERO){
            shoppingCartMapper.DeleteItems(userId,goodsId);
        }

        return Result.ok();
    }

    //减少一种购物车商品
    @Override
    public Result removesGoods(HttpServletRequest request) {
        String goodsIdTemp = request.getParameter("goodsId");
        long goodsId = Long.valueOf(goodsIdTemp);
        long userId=Long.valueOf(request.getParameter("userId"));
//        long userId = jwtGetUserId();
        if(shoppingCartMapper.DeleteItems(userId,goodsId)==ZERO){
            return Result.fail("该商品已不在购物车");
        };
        return Result.ok();
    }
}
