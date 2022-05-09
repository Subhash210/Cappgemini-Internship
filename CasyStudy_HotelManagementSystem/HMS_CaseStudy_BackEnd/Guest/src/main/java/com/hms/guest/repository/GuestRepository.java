package com.hms.guest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.guest.models.Guest;

@Repository
public interface GuestRepository extends MongoRepository<Guest, String> {

}