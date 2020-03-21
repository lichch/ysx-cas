package com.ysx.cas.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ysx.cas.api.service.TestHelloWord;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(version = "0.0.1")
public class TestHelloWordImpl implements TestHelloWord {

    @Override
    public String getHelloWord() {
        return "helloWord";
    }
}
