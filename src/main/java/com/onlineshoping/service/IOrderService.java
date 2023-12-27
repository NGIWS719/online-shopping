package com.onlineshoping.service;

import com.onlineshoping.dto.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public interface IOrderService {

    public Result getOrders(HttpServletRequest request);
    public Result getOrderDetail(HttpServletRequest request);
}
