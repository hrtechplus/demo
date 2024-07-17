package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class DummyController {
  
  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  String displayDefaultMessage() {
    return "Hello Worcvcvcld!";
  }
  
  @RequestMapping(value = "/hio", method=RequestMethod.GET)
  public String requestMethodName(@RequestParam String param) {
      return "Hello thid id in HI page";
  }
  

  


}
