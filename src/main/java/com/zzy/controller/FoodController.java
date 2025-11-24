package com.zzy.controller;

import com.zzy.domain.Food;
import com.zzy.domain.R;
import com.zzy.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping
    public R list(){
        List<Food> list = foodService.list();
        return R.ok();
    }
}
