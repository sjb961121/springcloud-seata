package com.itlaoqi.seata.bussiness.service;

import com.itlaoqi.seata.bussiness.client.OrderServiceClient;
import com.itlaoqi.seata.bussiness.client.PointsServiceClient;
import com.itlaoqi.seata.bussiness.client.StorageServiceClient;
import com.itlaoqi.seata.bussiness.client.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BussinessService {
    @Resource
    private PointsServiceClient pointsServiceClient;
    @Resource
    private StorageServiceClient storageServiceClient;
    @Resource
    private OrderServiceClient orderServiceClient;



    public Order sale(String goodsCode , Integer quantity ,String username ,Integer points, Float amount ){
        pointsServiceClient.increase(username, points);
        storageServiceClient.decrease(goodsCode, quantity);
        Order order = orderServiceClient.create(goodsCode, quantity, username, points, amount);
        return order;
    }
}
