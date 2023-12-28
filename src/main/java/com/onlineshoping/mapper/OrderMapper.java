package com.onlineshoping.mapper;


import com.onlineshoping.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

//        查询某个用户的所有订单
        @Select("select * from `order` where user_id=#{userId}")
        public List<Order> selectOrderByUserId(long userId);

//        查询某个订单的详细信息
        @Select("select * from `order` where id=#{orderId}")
        public Order selectOrderDetail(long orderId);

        @Insert("")
        public void insertOrder(Order order);
}
