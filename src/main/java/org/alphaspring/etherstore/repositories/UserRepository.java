package org.alphaspring.etherstore.repositories;

import org.alphaspring.etherstore.entities.User;
import org.apache.el.lang.ELArithmetic;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
