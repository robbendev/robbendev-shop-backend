package com.robbendev.shop.order.interfaces;

import com.robbendev.common.base.BaseResult;
import com.robbendev.shop.order.application.IOrderService;
import com.robbendev.shop.order.dto.request.FindOrderReq;
import com.robbendev.shop.order.dto.response.FindOrderResp;
import com.robbendev.shop.order.service.IOrderApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户接口（user interface,概念参考ddd）api
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:13 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController implements IOrderApi {

    @Resource
    IOrderService orderService;

    @Override
    @PostMapping("/findOrder")
    public BaseResult<FindOrderResp> findOrder(@RequestBody FindOrderReq req) {
        FindOrderResp resp = orderService.findOrder(req);
        return BaseResult.success(resp);
    }

}
