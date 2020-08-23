package com.log.feign.controller;

import com.log.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name")String name){
        return hiService.sayHiFromClientOne(name);
    }
}
