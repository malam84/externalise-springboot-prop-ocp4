package com.externalise.prop.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Controller {

    @Value("${ext.app.prop}")
    private String extProp;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getExtProperties(){
        System.out.println(extProp);
        return extProp;
    }
}
