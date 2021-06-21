package com.robbendev.shop.order.infrastucture.repository;

import com.robbendev.shop.order.domain.Order;
import com.robbendev.shop.order.domain.OrderRepository;
import com.robbendev.shop.order.infrastucture.dataobject.OrderDO;
import com.robbendev.shop.order.infrastucture.mapper.OrderMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>
 * 仓储的db实现。
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:25 下午
 */
@Component
public class OrderRepositoryDBImpl implements OrderRepository {

    @Resource
    OrderMapper orderMapper;


    @Override
    public Order findById(Long id) {

        OrderDO orderDO = orderMapper.getById(id);

        //对象转换替换方案 mapsStruct 或者beanUtils。
        //有对实体作状态跟踪的方案，但是比较复杂，这里没有选用。
        //所以在ddd选型的时候不用全上，适合就好。
        Order order = new Order();
        order.setId(orderDO.getId());
        order.setAmount(orderDO.getAmount());
        order.setProductName(orderDO.getProductName());

        return order;
    }
}
