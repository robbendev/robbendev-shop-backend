package com.robbendev.shop.user;

import com.robbendev.common.util.JsonUtilByFsJson;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/4/2 9:35 上午
 */
@Service
public class TokenServiceRedisImpl implements TokenService {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Override
    public void save(Token token) {
        stringRedisTemplate.opsForValue().set(token.getToken(), JsonUtilByFsJson.beanToJson(token)
                , 1, TimeUnit.DAYS);
    }

    @Override
    public void remove(String token) {
        stringRedisTemplate.delete(token);
    }
}
