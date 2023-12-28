package com.onlineshoping.service;

import com.onlineshoping.dto.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public interface IGoodsService {
    public Result getGoods(HttpServletRequest request);
}
