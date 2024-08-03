package com.example.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.entities.User;
import java.util.List;




public interface UserRepository extends CrudRepository<User, Integer> {
List<User> findByName(String name);
List<User> findByCityAndName(String city,String name);
}
