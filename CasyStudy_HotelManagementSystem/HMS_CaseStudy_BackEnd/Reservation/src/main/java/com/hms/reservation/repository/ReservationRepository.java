package com.hms.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.reservation.models.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {

}