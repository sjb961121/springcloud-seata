package com.itlaoqi.seata.points.service;


import com.itlaoqi.seata.points.dao.PointsDAO;
import com.itlaoqi.seata.points.entity.Points;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PointsService {
    @Resource
    private PointsDAO pointsDAO;

    public Points increase(String username, Integer quantity) {
        Points points = pointsDAO.findByUsername(username);
        points.setQuantity(points.getQuantity() + quantity);
        pointsDAO.update(points);
        return points;
    }
}
