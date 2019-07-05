package com.fdorval.simpleapp.demo.rest;


import com.fdorval.simpleapp.demo.rest.dto.CoolResult;
import com.fdorval.simpleapp.demo.rest.util.CoolCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoolController {

    @Autowired
    CoolCalculator coolCalculator;

    @RequestMapping("/coolitude")
    public ResponseEntity getCoolitude(@RequestParam(value="name") String name) {

        if (name.matches(".*\\d.*")){
            return new ResponseEntity<String>("Pas de chiffres dans le prénom SVP!",HttpStatus.BAD_REQUEST);

        }
        CoolResult result = coolCalculator.getCoolScore(name);

        return new ResponseEntity<CoolResult>(result, HttpStatus.OK);


    }
}