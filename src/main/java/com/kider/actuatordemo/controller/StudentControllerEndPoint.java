package com.kider.actuatordemo.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerEndpoint(id="student-controller-endpoint")
public class StudentControllerEndPoint {


    @ResponseBody
    @GetMapping("/student")
    public String getStudentInformation(@RequestParam("name") String name){
        return "1";
    }
}
