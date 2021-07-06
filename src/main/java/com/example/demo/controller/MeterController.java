package com.example.demo.controller;

import com.example.demo.service.MeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/meter")
@RestController
public class MeterController {
    @Autowired
    private MeterService meterService;
    @RequestMapping("/setData")
    public void setData(double value){
        meterService.update(value);
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("/get")
    public double get(){
        return meterService.get();
    }
}
