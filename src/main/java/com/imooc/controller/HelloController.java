package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by root on 2017/4/4.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "id", required = false, defaultValue = "18") int Myid) {
        return "id:" + Myid;
    }
}
