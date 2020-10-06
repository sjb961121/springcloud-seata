package com.itlaoqi.seata.storage.service;

import com.itlaoqi.seata.storage.dao.StorageDAO;
import com.itlaoqi.seata.storage.entity.Storage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StorageService {
    @Resource
    private StorageDAO storageDAO;

    public synchronized Storage decrease(String goodsCode, Integer quantity) {
        Storage storage = storageDAO.findByGoodsCode("coke");
        if (storage.getQuantity() >= quantity) {
            storage.setQuantity(storage.getQuantity() - quantity);
        }else{
            throw new RuntimeException(goodsCode + "库存不足,目前剩余库存:" + storage.getQuantity() );
        }
        storageDAO.update(storage);
        return storage;
    }
}
