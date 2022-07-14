package com.cognizant.authorization.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * This is a model class which is used as a response for the login method of
 * JwtAuthenticationController class. This class contains fields like UserId and
 * the Authentication Token generated in that method.
 */


public class UserToken {

	private String userid;

	private String authToken;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public UserToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserToken(String userid, String authToken) {
		super();
		this.userid = userid;
		this.authToken = authToken;
	}
	
	
}
