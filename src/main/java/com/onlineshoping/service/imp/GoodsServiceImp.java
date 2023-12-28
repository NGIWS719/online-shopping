package com.onlineshoping.service.imp;

import com.onlineshoping.dto.Result;
import com.onlineshoping.mapper.GoodsMapper;
import com.onlineshoping.pojo.Goods;
import com.onlineshoping.service.IGoodsService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImp implements IGoodsService {
    @Resource
    GoodsMapper goodsMapper;
    public Result getGoods(HttpServletRequest request) {
        List<Goods> goods = goodsMapper.getAllGoods();
        return Result.ok(goods);
    }
}
