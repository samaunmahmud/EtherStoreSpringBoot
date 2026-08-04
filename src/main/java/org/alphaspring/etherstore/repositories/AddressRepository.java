package org.alphaspring.etherstore.repositories;

import org.alphaspring.etherstore.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}