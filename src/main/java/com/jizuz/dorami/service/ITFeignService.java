package com.jizuz.dorami.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("cortbar")
public interface ITFeignService {

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    String getTsUser();

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    String ok();

}
