package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("增加一个商品！");
        return "add";
    }
}
