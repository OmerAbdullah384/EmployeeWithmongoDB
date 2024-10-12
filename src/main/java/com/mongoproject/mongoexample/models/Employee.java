package com.mongoproject.mongoexample.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Employee")
public class Employee {
	@Id
	private String rollno;
	private String name;
	private boolean adderess;
	

}
