package com.robbendev.shop.order.dto.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:36 下午
 */
@Data
public class FindOrderResp {

    private Long id;
    private BigDecimal amount;
    private String productName;
}
