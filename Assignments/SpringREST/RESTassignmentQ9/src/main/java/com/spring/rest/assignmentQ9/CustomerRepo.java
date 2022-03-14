package com.spring.rest.assignmentQ9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<customer, Integer> {
}