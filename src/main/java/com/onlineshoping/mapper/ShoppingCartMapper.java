package com.onlineshoping.mapper;

import com.onlineshoping.pojo.Goods;
import com.onlineshoping.pojo.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    //打印购物车信息
    @Select("select goods_id,user_id,number from shopping_cart where user_id = #{id}")
    public List<ShoppingCart> SelectShopCartById(long id);
    //查询单个购物车
    @Select("select goods_id,user_id,number from shopping_cart where user_id=#{userId} and goods_id=#{goodsId} ")
    public ShoppingCart SelectShopCartByIdGoodsId(long userId,long goodsId);
    //添加商品到购物车
    @Insert("insert into shoppingcart(goods_id,user_id,number) values(${goods_id},#{user_id},#{number})")
    public int InsertItem(ShoppingCart shoppingcart);
    //从购物车中移除商品
    @Delete("delete from shopping_cart where user_id = #{user_id} and goods_id = #{goods_id}")
    public int DeleteItems(long user_id,long goods_id);

    //从购物车中减少一个商品
    //指定用户购物车中指定商品数量-1
    @Update("Update Shopping_cart SET number = number-1 where user_id = #{user_id} and goods_id = #{goods_id}")
    public int SubtractItemNumber(long user_id,long goods_id);
    //指定用户购物车中指定商品数量+number
    @Update("Update Shopping_cart SET number = number+#{number} where user_id = #{user_id} and goods_id = #{goods_id}")
    public int AddItemNumber(long user_id,long goods_id,int number);
    //清空购物车
    @Delete("delete from shopping_cart where user_id = #{user_id}")
    public int DeleteShoppingCart(long user_id);
    //计算总价格
    //计算总价格
    @Select("select SUM(goods.price * shopping_cart.number) AS total" +
            "   From shopping_cart Inner join goods " +
            "       On shopping_cart.goods_id = goods.id" +
            "           Where shopping_cart.user_id = #{user_id}")
    public double PrintSumPrice(long user_id);
    //查找指定用户是否有指定商品
    @Select("select goods_id,user_id,number from shopping_cart where user_id = #{userId} and goods_id = #{goodsId}")
    public ShoppingCart SelectUserGoods(long userId,long goodsId);
}
