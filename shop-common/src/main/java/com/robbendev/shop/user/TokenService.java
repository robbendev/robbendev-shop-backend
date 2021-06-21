package com.robbendev.shop.user;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:35 上午
 */
public interface TokenService {

    void save(Token token);

    void remove(String token);

}
