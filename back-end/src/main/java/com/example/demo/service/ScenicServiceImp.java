package com.example.demo.service;

import com.example.demo.Mapper.ScenicMapper;
import com.example.demo.pojo.Scenic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicServiceImp implements ScenicService{


    @Autowired
    private ScenicMapper scenicMapper;
    @Override
    public List<Scenic> list() {
        return scenicMapper.list();
    }

    @Override
    public void delete(Integer ScenicID) {
        scenicMapper.delete(ScenicID);
    }

    @Override
    public void add(Scenic scenic) {
        scenicMapper.add(scenic);
    }
}
