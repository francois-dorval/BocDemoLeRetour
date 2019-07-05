package com.fdorval.simpleapp.demo.rest;


import com.fdorval.simpleapp.demo.rest.dto.CoolResult;
import com.fdorval.simpleapp.demo.rest.util.CoolCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoolController {

    @Autowired
    CoolCalculator coolCalculator;

    @RequestMapping("/coolitude")
    public CoolResult getCoolitude(@RequestParam(value="name") String name) {
        return coolCalculator.getCoolScore(name);


    }
}