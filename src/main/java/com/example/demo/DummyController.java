package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class DummyController {
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  String displayDefaultMessage() {
    return "Hello Worcvcvcld!";
  }
  

  


}