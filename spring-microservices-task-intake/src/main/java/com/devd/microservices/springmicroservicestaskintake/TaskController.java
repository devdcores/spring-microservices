package com.devd.microservices.springmicroservicestaskintake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Devaraj Reddy on 2/17/2018.
 */
@RestController
public class TaskController {

    @Autowired
    TaskProcessor t;

    @RequestMapping(path = "/tasks",method = RequestMethod.POST)
    public String launchTask(@RequestBody String s){
        t.publishRequest(s);
        return "success";
    }
}