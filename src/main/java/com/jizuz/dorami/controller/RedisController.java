package com.jizuz.dorami.controller;

import com.jizuz.dorami.core.utils.RedisStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisStringUtils redisStringUtils;

    @RequestMapping(value = "/setRedis", method = RequestMethod.GET)
    public String setRedisString() {
        redisStringUtils.setKey("name", "jizux");
        return "SUCCESS";
    }

    @RequestMapping(value = "/getRedis", method = RequestMethod.GET)
    public String getRedisString() {
        String result = redisStringUtils.getVal("name");
        if (StringUtils.isBlank(result)) {
            return "get fail";
        }
        return result;
    }
}
