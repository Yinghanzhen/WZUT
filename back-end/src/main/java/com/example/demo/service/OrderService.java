package com.example.demo.service;
import com.example.demo.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> list(String orderID,String userID,String scenicName);
}
