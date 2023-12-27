package com.onlineshoping.mapper;


import com.onlineshoping.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

        @Select("select * from order where userId=#{id}")
        public List<?> selectOrderByUserId(long id);

        @Insert("")
        public void insertOrder(Order order);
}
