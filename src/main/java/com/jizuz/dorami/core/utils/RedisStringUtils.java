package com.jizuz.dorami.core.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisStringUtils {

    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key, String val) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, val);
    }

    public String getVal(String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }

    public void lPush(String key, String val) {
        ListOperations<String, String> ops = template.opsForList();
        ops.leftPush(key, val);
    }

    public void lPush(String key, String... vals) {
        ListOperations<String, String> ops = template.opsForList();
        ops.leftPushAll(key, vals);
    }

    public void rPush(String key, String val) {
        ListOperations<String, String> ops = template.opsForList();
        ops.rightPush(key, val);
    }

    public void lPop(String key) {
        ListOperations<String, String> ops = template.opsForList();
        ops.leftPop(key);
    }
}
