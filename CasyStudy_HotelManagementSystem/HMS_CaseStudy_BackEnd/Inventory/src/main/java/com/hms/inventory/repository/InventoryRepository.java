package com.hms.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hms.inventory.models.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String> {

}
