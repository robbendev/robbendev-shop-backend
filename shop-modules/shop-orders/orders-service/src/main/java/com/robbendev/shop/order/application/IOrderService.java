package com.robbendev.shop.order.application;

import com.robbendev.shop.order.dto.request.FindOrderReq;
import com.robbendev.shop.order.dto.response.FindOrderResp;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:30 下午
 */
public interface IOrderService {

    /**
     * 查询订单
     *
     * @param req req
     * @return order
     */
    FindOrderResp findOrder(FindOrderReq req);
}
