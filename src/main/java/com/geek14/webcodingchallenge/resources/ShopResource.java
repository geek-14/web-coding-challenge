package com.geek14.webcodingchallenge.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geek14.webcodingchallenge.models.Position;
import com.geek14.webcodingchallenge.models.Shop;

@RestController
@RequestMapping("/shops")
public class ShopResource {
	
	@GetMapping("/all")
	public List<Shop> getShops(){
		return Collections.singletonList(new Shop("Clothes", null, new Position(4, -1)));
	}
	
	@GetMapping("/{userId}")
	public List<Shop> getUserShops(@PathVariable("userId") Integer userId){
		return Collections.singletonList(new Shop("Bento", true, new Position(5, 3)));
	}

}
