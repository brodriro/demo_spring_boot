package com.demospring.core.models;

import java.util.Date;

public class Post {

	private int id;
	private String description;
	private String image;
	private Date date;
	
	
	public Post() {
		
	}
	
	public Post(int id, String description, String image, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.image = image;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
