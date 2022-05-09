package com.hms.rooms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.rooms.models.Rooms;

@Repository
public interface RoomsRepository extends MongoRepository<Rooms, String> {

}