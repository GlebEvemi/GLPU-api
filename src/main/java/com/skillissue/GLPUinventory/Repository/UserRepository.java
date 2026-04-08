package com.skillissue.GLPUinventory.Repository;

import org.springframework.data.repository.CrudRepository;

import com.skillissue.GLPUinventory.Entities.User;

public interface UserRepository extends CrudRepository<User, String> {
    
}