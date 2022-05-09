package com.hms.owner.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSecurityRepository extends MongoRepository<OwnerSecurityModel, String> {

}
