package com.example.demo.Mapper;
import com.example.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> list(String orderID,String userID,String scenicName);
}
