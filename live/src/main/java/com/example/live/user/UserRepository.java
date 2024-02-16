package com.example.live.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// porque se asigna user y long aqui <User, Long> 
// se asgina el atributo del primer valor del objeto 
// que interactua con la base de datos
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


   
}
