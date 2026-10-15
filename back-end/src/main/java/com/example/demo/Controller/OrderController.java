package com.example.demo.Controller;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.Result;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    //按输入信息全部订单，若未输入则查询全部
    @GetMapping("/order")
    public Result list(String orderID,String userID,String scenicName){
        List<Order> orderList = orderService.list(orderID,userID,scenicName);
        return Result.success(orderList);
    }
}
