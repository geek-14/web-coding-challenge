package com.geek14.webcodingchallenge.models;

public class Shop {
	
	private Integer id;
	
	private String name;
	
	private Boolean liked;

	public Shop(String name, Boolean liked) {
		super();
		this.name = name;
		this.liked = liked;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLiked() {
		return liked;
	}

	public void setLiked(Boolean liked) {
		this.liked = liked;
	}
	
	

}
