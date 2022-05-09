package com.hms.receptionist.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistSecurityRepository extends MongoRepository<ReceptionistSecurityModel, String> {

}
