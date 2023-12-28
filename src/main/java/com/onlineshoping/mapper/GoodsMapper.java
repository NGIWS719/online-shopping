package com.onlineshoping.mapper;

import com.onlineshoping.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsMapper {

    // 查询所有商品
    @Select("select * from goods")
    public List<Goods> getAllGoods();

    //根据指定的商品 名称 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from Goods where name like CONCAT('%',#{name},'%')")
    public List<Goods> SelectByName(String name);

    @Select("select id,shop_id,name,price,image,description from Goods where id = #{id}")
    public Goods SelectById(long id);
    //根据指定的商品 价格范围 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from Goods where price between #{lprice} and #{rprice}")
    public Goods SelectByPrice(double lprice,double rprice);
    //根据指定的商品 描述 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from goods where description like '%#{description}%'")
    public Goods SelectByDescription(String description);


    //根据指定的商品 所在地（即发货地） 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from goods where location like '%#{location}%'")
    public Goods SelectByLocation(String location);
    //对指定的商品 价格 进行 升序 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from goods order by price asc")
    public Goods OrderByPriceAsc();
    //对指定的商品 价格 进行 降序 来查询相应的商品信息
    @Select("select id,shop_id,name,price,image,description from goods order by price desc")
    public Goods OrderByPriceDesc();
    //更新指定的商品 价格
    @Update("update Goods set price = #{price} where id = #{goods.id}")
    public int UpdateGoodsPrice(Goods goods);
    //更新指定的商品 图片
    @Update("update Goods set image = #{image} where id = #{goods.id}")
    public int UpdateGoodsImage(Goods goods);
    //更新指定的商品 描述
    @Update("update Goods set description = #{description} where id = #{goods.id}")
    public int UpdateGoodsDescription(Goods goods);
    //添加新的商品
    @Insert("Insert into Goods(id,shop_id,name,price,image,description) values(#{goods.id},#{shop_id},#{goods.name},#{price},#{image},#{description})")
    public int InsertGoods(Goods goods);
    //删除指定商品
    @Delete("Delete from User where id = #{id}")
    public int DeleteGoods(Long id);
}
