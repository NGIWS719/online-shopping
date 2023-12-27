package com.onlineshoping.mapper;


import com.onlineshoping.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where telephone = #{telephone}")
    public User SelectByTelephone(String telephone);
    @Insert("INSERT INTO user (nickname, password, telephone) VALUES (#{nickname}, #{password}, #{telephone})")
    public int InsertUser(User user);
    @Select("select * from user where telephone = #{telephone} and password =#{password}")
    public User checkLoginByPhonePwd(String telephone,String password);

}
