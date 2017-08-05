package com.mageddo.designpatterns.cap_11_5;

public class PersonBeanImpl implements PersonBean{
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	@Override
	public int getHotOrNotRating() {
		if(ratingCount == 0) return 0;
		return (rating / ratingCount);
	}
	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
		
	}
	
	
	
}
