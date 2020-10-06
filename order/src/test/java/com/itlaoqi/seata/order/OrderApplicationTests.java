package com.itlaoqi.seata.order;

import com.itlaoqi.seata.order.entity.Order;
import com.itlaoqi.seata.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {
    @Resource
    private OrderService orderService;

    @Test
    public void testOrder(){
        Order order = orderService.createOrder("coke", 3, "zhangsan", 3, 30f);
        System.out.println(order);
    }


}
