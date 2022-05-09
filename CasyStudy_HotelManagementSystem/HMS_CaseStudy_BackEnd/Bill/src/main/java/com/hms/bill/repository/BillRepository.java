package com.hms.bill.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.bill.models.Bill;

@Repository
public interface BillRepository extends MongoRepository<Bill, String> {

}