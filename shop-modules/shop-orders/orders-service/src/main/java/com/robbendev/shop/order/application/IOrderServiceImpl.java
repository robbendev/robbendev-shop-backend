package com.robbendev.shop.order.application;

import com.robbendev.shop.order.domain.Order;
import com.robbendev.shop.order.domain.OrderRepository;
import com.robbendev.shop.order.dto.request.FindOrderReq;
import com.robbendev.shop.order.dto.response.FindOrderResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 应用服务，这里是浅浅的一层，可以作为领域层的门面，实体到出参的转换在这里做。
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:35 下午
 */
@Service
public class IOrderServiceImpl implements IOrderService {

    @Resource
    OrderRepository orderRepository;


    @Override
    public FindOrderResp findOrder(FindOrderReq req) {
        Order order = orderRepository.findById(req.getId());
        FindOrderResp findOrderResp = new FindOrderResp();
        findOrderResp.setAmount(order.getAmount());
        findOrderResp.setProductName(order.getProductName());
        findOrderResp.setId(order.getId());

        return findOrderResp;
    }
}
