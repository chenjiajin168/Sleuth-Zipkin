package com.chenjiajin.controller;

import com.chenjiajin.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DaughterSleuthController {

    @Autowired
    private TestService service;

    /**
     * sleuth测试接口
     */
    @RequestMapping("/sleuth")
    public String sleuth(@RequestParam String str) {
        log.info("调用了daughter服务的sleuth接口");
        return service.sleuth(str);
    }

}