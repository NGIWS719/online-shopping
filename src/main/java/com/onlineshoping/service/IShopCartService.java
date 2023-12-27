package com.onlineshoping.service;
import com.onlineshoping.dto.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public interface IShopCartService {


    public Result selectListShopCart(long id);
    public Result addGoods(HttpServletRequest request);
    public Result clearCart(HttpServletRequest request);
    public Result priceCount(HttpServletRequest request);

    Result removeGoods(HttpServletRequest request);
    Result removesGoods(HttpServletRequest request);
}
