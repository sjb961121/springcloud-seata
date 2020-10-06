package com.itlaoqi.seata.order.service;


import com.itlaoqi.seata.order.dao.OrderDAO;
import com.itlaoqi.seata.order.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {
    @Resource
    private OrderDAO orderDAO;
    public Order createOrder(String goodsCode , Integer quantity ,String username ,Integer points, Float amount ){
        Order order = new Order(username,points,goodsCode,quantity,amount);
        orderDAO.insert(order);
        return order;
    }
}
