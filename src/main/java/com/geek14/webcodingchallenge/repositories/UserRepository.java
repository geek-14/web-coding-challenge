package com.geek14.webcodingchallenge.repositories;

import org.springframework.data.repository.CrudRepository;

import com.geek14.webcodingchallenge.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
