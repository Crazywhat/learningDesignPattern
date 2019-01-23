package com.jockey.ProxyPattern.protectionProxy;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	int rating = 0;
	int ratingCount = 0;

	
	public PersonBeanImpl(String name, String gender, String interests) {
		super();
		this.name = name;
		this.gender = gender;
		this.interests = interests;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getGender() {
		
		return gender;
	}

	@Override
	public String getInterests() {
		
		return interests;
	}

	@Override
	public int getHotorNotRating() {
		if (ratingCount == 0) {
			return 0;
		}
		return (rating/ratingCount);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		++ratingCount;
	}

}
