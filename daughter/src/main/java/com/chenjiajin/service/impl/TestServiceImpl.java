package com.chenjiajin.service.impl;

import com.chenjiajin.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Override
    public String sleuth(String str) {
        log.info("调用了daughter业务层");
        //int a = 1 / 0;
        System.err.println("str = " + str);
        return str;
    }
}

