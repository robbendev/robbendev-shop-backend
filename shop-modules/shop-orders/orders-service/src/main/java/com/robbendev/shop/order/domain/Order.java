package com.robbendev.shop.order.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 实体，聚合，聚合根！概念参考ddd。像id这些可以用primitive domain实现，像这样。
 * <code>private OrderId id;</code>
 *
 * @author robbendev
 * @since 2021/4/1 5:14 下午
 */
@Data
public class Order {

    private Long id;
    private BigDecimal amount;
    private String productName;
}
