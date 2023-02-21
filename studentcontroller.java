package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
	//@Value("${value.name}")
	//private String newnameString;
	@GetMapping("/")
	public String homepage()
	{
		return "Welcome to Student list";
	}
	@GetMapping("/list")
	public List<student> getList(){
		List<student> detailsList=new ArrayList<>();
		detailsList.add(new student(1,"xxx",34));
		detailsList.add(new student(2,"gjh",35));
		detailsList.add(new student(3,"der",37));
		detailsList.add(new student(4,"bhj",34));
		
		return detailsList;
	}
}
