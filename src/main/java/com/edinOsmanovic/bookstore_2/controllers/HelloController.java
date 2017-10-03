package com.edinOsmanovic.bookstore_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eo on 10/3/17.
 *
 * set controller class
 * set request mapping
 * return plain text from controller to browser
 */

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }

    @RequestMapping(value ="bye")
    @ResponseBody
    public String bye(){
        return " Good bye!";
    }
}
