package com.chenjiajin.controller;

import com.chenjiajin.feign.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SonSleuthController {

    @Autowired
    private FeignService feignService;

    // http://localhost:81/sleuth
    @RequestMapping("/sleuth")
    public String feign1() {
        log.info("调用了son服务的sleuth接口");
        String abc = feignService.sleuth("abc");
        System.err.println("abc = " + abc);
        return abc;
    }


}