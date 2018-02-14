package com.devd.microservices.springmicroservicesconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Devaraj Reddy on 2/14/2018.
 */
@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;

    @Value("${connstring}")
    String connString;


    @RequestMapping("/rate")
    public String getRate(Model model) {

        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", laneCount);
        model.addAttribute("tollstart", tollStart);
        model.addAttribute("connstring", connString);

        return "rateView";
    }
}