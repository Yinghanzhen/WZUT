package com.example.demo.Mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> list();
    @Delete("delete from user where UserID=#{userID}")
    void delete(Integer userID);
}
