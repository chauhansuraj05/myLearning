package com.qsp;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Id
	private int id;
	private String name;
	private int age;
}
