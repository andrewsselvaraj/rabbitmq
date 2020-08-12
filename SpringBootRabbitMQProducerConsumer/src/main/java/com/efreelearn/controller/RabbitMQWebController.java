package com.efreelearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efreelearn.model.Employee;
import com.efreelearn.service.RabbitMQSender;

import sun.util.calendar.BaseCalendar.Date;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

	//@Autowired
	//RabbitMQSender rabbitMQSender;
//http://localhost:8080/javainuse-rabbitmq/producer?empName=andre&empId=890808
	//https://efreelearnrabbitmq.cfapps.io/javainuse-rabbitmq/producer?empName=andre&empId=890808
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
	
	Employee emp=new Employee();
	int i=1;
	i = i+1;
	emp.setEmpId(empId+i);
	emp.setEmpName(empName);
	//rabbitMQSender.send(emp);
	i = i+1;
	emp.setEmpId(empId+i);
	emp.setEmpName(empName);
	//rabbitMQSender.send(emp);
	i = i+1;
	emp.setEmpId(empId+i);
	emp.setEmpName(empName);
	//rabbitMQSender.send(emp);
	i = i+1;
	emp.setEmpId(empId+i);
	emp.setEmpName(empName);
	//rabbitMQSender.send(emp);
	i = i+1;
	emp.setEmpId(empId+i);
	emp.setEmpName(empName);
	//rabbitMQSender.send(emp);
	
 
		String s ="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/architect-microservice-container-applications/microservice-based-composite-ui-shape-layout";

		return s+"i call multiple serces in microservicse before a service send a response  another services should execute and return response how to achive this";
	}

}

