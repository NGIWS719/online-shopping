package com.onlineshoping.mapper;


import com.onlineshoping.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

//        查询某个用户的所有订单
        @Select("select * from order where userId=#{userid}")
        public List<?> selectOrderByUserId(long userid);

//        查询某个订单的详细信息
        @Select("select * from order where orderId=#{orderid}")
        public Order selectOrderDetail(long orderid);

        @Insert("")
        public void insertOrder(Order order);
}
