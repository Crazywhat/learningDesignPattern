package com.jockey.ProxyPattern.protectionProxy;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotorNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
