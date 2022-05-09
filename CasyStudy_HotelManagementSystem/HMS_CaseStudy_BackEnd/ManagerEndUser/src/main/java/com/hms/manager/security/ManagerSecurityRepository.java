package com.hms.manager.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerSecurityRepository extends MongoRepository<ManagerSecurityModel, String> {

}
