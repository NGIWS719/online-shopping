package com.onlineshoping.controller;

import com.onlineshoping.dto.Result;
import com.onlineshoping.service.IOrderService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")   // 解决跨域问题
public class OrderController {
    @Resource
    IOrderService orderService;
    @GetMapping("/get_orders")
    public Result ordersGet(HttpServletRequest request) {
        return orderService.getOrders(request);
    }
    @GetMapping("/order_detail")
    public Result orderDetail(HttpServletRequest request) {
        return orderService.getOrderDetail(request);
    }
}
