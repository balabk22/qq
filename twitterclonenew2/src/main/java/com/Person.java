package com;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Person {
	
	private String user_id;
	private String password;
	private String fullName;
	private String email;
	private Timestamp joined;
	private boolean active;
	private Person following;
	private Person followers;
	private Tweet tweets;
	public Person getFollowing() {
		return following;
	}
	public void setFollowing(Person following) {
		this.following = following;
	}
	public Person getFollowers() {
		return followers;
	}
	public void setFollowers(Person followers) {
		this.followers = followers;
	}
	public Tweet getTweets() {
		return tweets;
	}
	public void setTweets(Tweet tweets) {
		this.tweets = tweets;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getJoined() {
		return joined;
	}
	public void setJoined(Timestamp joined) {
		this.joined = joined;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Person [user_id=" + user_id + ", password=" + password + ", fullName=" + fullName + ", email=" + email
				+ ", joined=" + joined + ", active=" + active + "]";
	}
	
	

}
