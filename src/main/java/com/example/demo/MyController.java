package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/test")
	public String getMessage(){
		return "Hello";
	}
	
	//in browser url: "localhost:8080/employee
//	@RequestMapping("/employee")
//	public Employee getEmployee(){
//		return new Employee(101,"Izhar");
//	}
	
	//in browser url: "localhost:8080/employee?name=izhar"
	@RequestMapping("/employee")
	public Employee getEmployee(@RequestParam(name="name") String Name)
	{
		return new Employee(1,Name);
	}
	
	@RequestMapping("employee/{Name}")
	public String showName(@PathVariable String Name)
	{
		return "Welcome "+ Name;
	}
	
}
