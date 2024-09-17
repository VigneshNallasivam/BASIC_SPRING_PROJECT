package com.example.goods.controller;

import com.example.goods.model.Goods;
import com.example.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class GoodsController
{
	@Autowired
	public GoodsService service;
	
    @GetMapping("/get")
    public String greeting(Goods goods)
    {
     return "<h1><i>Good Evening</i></h1>";
    }
    
    @PostMapping("/post")
    public Goods posting(@RequestBody Goods goods)
    {
        Goods goods1 = service.insert(goods);
        return goods1;
    }

}
