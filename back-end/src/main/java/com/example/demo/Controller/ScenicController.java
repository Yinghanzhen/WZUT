package com.example.demo.Controller;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.Scenic;
import com.example.demo.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScenicController {
    @Autowired
    private ScenicService scenicService;
    //查询全部景区
    @GetMapping("/scenic")
    public Result list(){
        List<Scenic> seclist =  scenicService.list();
        return Result.success(seclist);
    }
    //删除景区
    @DeleteMapping("/scenic/{ScenicID}")
    public Result delete(@PathVariable Integer ScenicID){
        scenicService.delete(ScenicID);
        return Result.success();
    }

    //新增景区
    @PostMapping("/scenic")
    public Result add(@RequestBody Scenic scenic){
        scenicService.add(scenic);
        return Result.success();
    }
}
