package com.example.demo.service;
import com.example.demo.Mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> list(String orderID,String userID,String scenicName) {
        return orderMapper.list(orderID,userID,scenicName);
    }
}
