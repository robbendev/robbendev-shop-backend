package com.robbendev.shop.user;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:35 上午
 */
@Service
public class TokenServiceImpl implements TokenService {

    private Map<String, Token> session = new ConcurrentHashMap<>();

    @Override
    public void save(Token token) {
        session.put(token.getToken(), token);
    }

    @Override
    public void remove(String token) {
        session.remove(token);
    }
}
