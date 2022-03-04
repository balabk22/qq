package com;

import java.sql.Date;

public class Tweet {
	
	private int tweetId;
	private String user;
	private String message;
	private Date created;
	public int getTweetId() {
		return tweetId;
	}
	public void setTweetId(int i) {
		this.tweetId = i;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String string) {
		this.user = string;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
