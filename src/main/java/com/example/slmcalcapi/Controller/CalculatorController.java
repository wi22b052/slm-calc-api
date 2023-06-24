package com.example.slmcalcapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    /**
        Add two integers.
     */
    @RequestMapping("/calc/add")
    public int add(@RequestParam int a,
                   @RequestParam int b){
        return a +b;
    }

    @RequestMapping("/calc/subtract")
    public int subtract(@RequestParam int a,
                   @RequestParam int b){
        return a -b;
    }
}
