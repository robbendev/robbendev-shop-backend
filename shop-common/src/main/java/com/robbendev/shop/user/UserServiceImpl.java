package com.robbendev.shop.user;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:30 上午
 */
@Service
public class UserServiceImpl implements UserService {

    private ConcurrentHashMap<String, Token> session = new ConcurrentHashMap<>();

    @Override
    public Token wxLogin(String code) {
        Token token = new Token();
        User user = new User();

        //..具体的业务登陆逻辑省略

        String tokenStr = IdWorker.getIdStr();
        token.setToken(tokenStr);
        token.setUser(user);
        return token;
    }
}
