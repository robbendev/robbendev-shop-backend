package com.robbendev.shop.user;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:22 上午
 */
public interface UserService {

    Token wxLogin(String code);

}
