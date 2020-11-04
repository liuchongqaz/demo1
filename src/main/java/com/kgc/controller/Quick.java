package com.kgc.controller;/*
@author liu Chong
@date
@version
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){

        return "hello ";
    }
}
