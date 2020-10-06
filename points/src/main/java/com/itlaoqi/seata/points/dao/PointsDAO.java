package com.itlaoqi.seata.points.dao;


import com.itlaoqi.seata.points.entity.Points;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PointsDAO {
    public Points findByUsername(String username);
    public void update(Points points);
}
