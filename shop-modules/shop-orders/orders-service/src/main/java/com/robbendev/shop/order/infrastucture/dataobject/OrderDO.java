package com.robbendev.shop.order.infrastucture.dataobject;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 * 数据对象，和数据库表字段一一对应。
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:16 下午
 */
@Data
public class OrderDO {

    private Long id;
    private BigDecimal amount;
    private String productName;
}
