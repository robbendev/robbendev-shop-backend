package com.robbendev.shop.user;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:29 上午
 */
@Data
public class Token {

    private User User;
    private String token;
}
