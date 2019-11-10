package com.geek14.webcodingchallenge.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geek14.webcodingchallenge.models.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position, Integer> {

}
