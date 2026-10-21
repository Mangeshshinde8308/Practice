package com.myschool.std_details_api.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@RestController //controller+responsebody 
@Slf4j 
public class Stdcontroller {

    @GetMapping("/test")
    public String test(){
        log.info("test method only");
        return "testing api only";


    }
    
    
}
