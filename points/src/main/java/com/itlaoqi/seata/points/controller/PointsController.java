package com.itlaoqi.seata.points.controller;

import com.itlaoqi.seata.points.entity.Points;
import com.itlaoqi.seata.points.service.PointsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PointsController {
    @Resource
    private PointsService pointsService;

    @GetMapping("/increase")
    public Points increase(String username, Integer quantity) {
        return pointsService.increase(username, quantity);
    }
}
