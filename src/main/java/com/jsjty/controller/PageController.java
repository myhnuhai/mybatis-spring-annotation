package com.jsjty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 马英虎 on 2014/11/27.
 */
@Controller
@RequestMapping("/")
public class PageController  extends BaseController  {

    @RequestMapping("/")
    public String main(){
        return "index";
    }
}
