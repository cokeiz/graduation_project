package com.zzy.service.impl;

import com.zzy.domain.Food;
import com.zzy.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Override
    public List<Food> list() {
        return List.of();
    }
}
