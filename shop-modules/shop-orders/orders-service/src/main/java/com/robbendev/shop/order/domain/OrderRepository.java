package com.robbendev.shop.order.domain;

/**
 * <p>
 * 仓储接口，概念参考ddd，可以有多个实现，db实现呀，es实现等。
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:25 下午
 */
public interface OrderRepository {

    Order findById(Long id);
}
