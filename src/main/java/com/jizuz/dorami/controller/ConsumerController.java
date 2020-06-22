package com.jizuz.dorami.controller;

import com.jizuz.dorami.service.ITFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ITFeignService itFeignService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getTsUsers() {
        return itFeignService.getTsUser();
    }

    @RequestMapping(value = "/done", method = RequestMethod.GET)
    public String done() {
        return itFeignService.ok();
    }

}
