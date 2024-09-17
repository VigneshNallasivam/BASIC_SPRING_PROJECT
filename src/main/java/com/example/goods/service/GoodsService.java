package com.example.goods.service;

import com.example.goods.model.Goods;
import com.example.goods.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService
{
    @Autowired
    GoodsRepository repository;
 
    public Goods insert(Goods goods)
    {
        Goods goods1 = repository.save(goods);
        return goods1;
    }

}
