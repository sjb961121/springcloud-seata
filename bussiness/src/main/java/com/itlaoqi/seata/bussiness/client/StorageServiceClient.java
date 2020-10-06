package com.itlaoqi.seata.bussiness.client;

import com.itlaoqi.seata.bussiness.client.entity.Storage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("storage-service")
public interface StorageServiceClient {
    @GetMapping("/decrease")
    public Storage decrease(@RequestParam String goodsCode, @RequestParam Integer quantity);
}
