package com.pe.oauth.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private  String username;
	@Column
	@JsonIgnore
	private String password;
	//private String token;

	
	/*
	 * public static void setUser(String token,String username) { token=token;
	 * username = username; } public static String getUser() { return username; }
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}