package com.hms.department.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.department.models.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
