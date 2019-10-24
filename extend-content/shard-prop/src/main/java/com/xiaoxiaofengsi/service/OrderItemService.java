package com.xiaoxiaofengsi.service;

import com.xiaoxiaofengsi.entity.OrderItem;
import com.xiaoxiaofengsi.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OrderItemService {
    @Resource
    OrderItemMapper orderItemMapper;

    public void insert() {
        for (int i = 1; i <= 100; i++) {
            OrderItem orderItem = new OrderItem();
            orderItem.setItemId(i);
            orderItem.setOrderId(i);
            orderItem.setUserId(i);

            orderItemMapper.insert(orderItem);
        }
    }

    public OrderItem getOrderItemByItemId(Integer id){
        return orderItemMapper.selectByPrimaryKey(id);
    }

}
