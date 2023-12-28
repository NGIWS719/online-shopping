package com.onlineshoping.service.imp;

import com.onlineshoping.dto.Result;
import com.onlineshoping.mapper.OrderMapper;
import com.onlineshoping.pojo.Order;
import com.onlineshoping.service.IOrderService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements IOrderService {
    @Resource
    OrderMapper orderMapper;
    public Result getOrders(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        long id = Long.parseLong(userId);
        List<Order> orders = orderMapper.selectOrderByUserId(id);
        return Result.ok(orders);
    }

    public Result getOrderDetail(HttpServletRequest request) {
        String orderId = request.getParameter("orderId");
        Order order = orderMapper.selectOrderDetail(Long.parseLong(orderId));
        return Result.ok(order);
    }
}
