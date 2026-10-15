package com.example.demo.Controller;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //查询全部用户
    @GetMapping("/information")
    public Result list(){
        List<User> userList = userService.list();
        return Result.success(userList);
    }
    @DeleteMapping("/information/{UserID}")
    //删除用户
    public Result delete(@PathVariable Integer UserID){
        userService.delete(UserID);
        return Result.success();
    }
}
