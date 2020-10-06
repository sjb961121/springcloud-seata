package com.itlaoqi.seata.bussiness.client;

import com.itlaoqi.seata.bussiness.client.entity.Order;
import com.itlaoqi.seata.bussiness.client.entity.Points;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("order-service")
public interface OrderServiceClient {
    @GetMapping("/create")
    public Order create(@RequestParam String goodsCode ,
                        @RequestParam Integer quantity ,
                        @RequestParam String username ,
                        @RequestParam Integer points,
                        @RequestParam Float amount );
}
