package com.example.demo.Mapper;

import com.example.demo.pojo.Scenic;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScenicMapper {

    @Select("select * from scenic")
    List<Scenic> list();
    @Delete("delete from scenic where ScenicID=#{ScenicID}")
    void delete(Integer ScenicID);
    @Insert("INSERT INTO scenic(ScenicName,province,city,MaxLimit,ScenicID) values (#{scenicName},#{province},#{city},#{maxLimit},#{scenicID})")
    void add(Scenic scenic);
}
