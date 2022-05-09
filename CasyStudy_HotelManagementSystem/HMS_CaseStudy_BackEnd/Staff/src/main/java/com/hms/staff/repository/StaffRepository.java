package com.hms.staff.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.staff.models.Staff;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {

}