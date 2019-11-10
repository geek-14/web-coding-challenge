package com.geek14.webcodingchallenge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geek14.webcodingchallenge.models.Shop;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer> {
	
	@Query("select sh from Shop sh where sh.user.id = :id")
	List<Shop> findByUserId(Integer id);

}
