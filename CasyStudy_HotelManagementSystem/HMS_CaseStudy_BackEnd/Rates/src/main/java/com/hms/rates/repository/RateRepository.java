package com.hms.rates.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.rates.models.Rates;

@Repository
public interface RateRepository extends MongoRepository<Rates, String> {

}