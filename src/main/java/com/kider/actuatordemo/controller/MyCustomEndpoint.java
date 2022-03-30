package com.kider.actuatordemo.controller;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Endpoint(id="custom_endpoint")
@Component
public class MyCustomEndpoint {

	@Component
	@Endpoint(id = "student-endpoint")
	public class StudengEndPoint {

	    @ReadOperation
	    public String getStudent(@RequestParam("name") String name){
	        return "Get";
	    }

	    @WriteOperation
	    public String createStudent(){
	        return "write";
	    }

	    @DeleteOperation
	    public void deleteStudent(){
	        //write logic here
	    }

	}
}
