package com.mongoproject.mongoexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoproject.mongoexample.models.Employee;


@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {

}
