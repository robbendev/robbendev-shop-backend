package com.robbendev.shop.order.service;

import com.robbendev.common.base.BaseResult;
import com.robbendev.shop.order.dto.request.FindOrderReq;
import com.robbendev.shop.order.dto.response.FindOrderResp;

/**
 * <p>
 * 模块通信的api,具体的实现在用户接口层。
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:07 下午
 */
public interface IOrderApi {

    BaseResult<FindOrderResp> findOrder(FindOrderReq req);
}
