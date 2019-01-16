package com.soft.mikessolutions.userservice.repositories;

import com.soft.mikessolutions.userservice.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}