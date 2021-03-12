package com.kafka.parent.business.demo.controller;

import com.kafka.parent.business.demo.channels.WebSocketStreamingService;
import com.kafka.parent.business.demo.entity.MDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 **/
@RequestMapping("/api")
@RestController
public class DemoController {

    @Autowired
    protected WebSocketStreamingService service;

    @GetMapping(value = "/query")
    public String query(MDemo param) {
        service.sendKafka(param);
        return "success";
    }
}
