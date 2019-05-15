package com.ecomerce.webservice.repository;

import com.ecomerce.webservice.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Usuario, Integer> {

    Usuario findByName(String name);
}
