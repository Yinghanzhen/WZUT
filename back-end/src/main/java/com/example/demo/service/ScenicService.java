package com.example.demo.service;

import com.example.demo.pojo.Scenic;

import java.util.List;

public interface ScenicService {
    //查询所有景区
    List<Scenic> list();
    //删除景区
    void delete(Integer ScenicID);
    //添加景区
    void add(Scenic scenic);
}
