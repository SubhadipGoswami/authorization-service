package com.cognizant.authorization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * This is a model class which is used as a table using Spring Data
 * JPA's @Entity Annotations. It contains fields like UserId, Password and
 * UserName.
 */

@Entity(name = "user")
public class MyUser {

	@Id
	@Column(name = "userid", length = 20)
	private String userid;

	@Column(name = "password", length = 20)
	private String password;

	@Column(name = "username", length = 20)
	private String username;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyUser(String userid, String password, String username) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
	}
	
	

}
