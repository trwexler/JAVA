package com.codingdojo.routing.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

    @RequestMapping("/dojo")
    public String showProduct(){
    	return "The Dojo is awesome!";
    }
    

    
    @RequestMapping("/dojo/{location}")
    public String dojoCenter(@PathVariable("location") String location) {
        if(location.equals("burbank")) {
            return "Burbank Dojo is located in Southern California";
        }
        else if(location.equals("san-jose")) {
            return "SJ dojo is the headquarters";
        }
        else {
            return String.format("%s is pretty sweet!", location);
            
        }
    }
    
}
