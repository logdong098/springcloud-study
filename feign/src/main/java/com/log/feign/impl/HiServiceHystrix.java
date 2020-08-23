package com.log.feign.impl;

import com.log.feign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "say error";
    }
}
