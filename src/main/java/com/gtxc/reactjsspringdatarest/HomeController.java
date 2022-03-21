package com.gtxc.reactjsspringdatarest;

/*
    Created by gt at 1:22 AM on Tuesday, March 01, 2022.
    Project: spring-data-rest-reactjs, Package: com.gtxc.springdatarestreactjs.
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
