package com.zomato.dto;

public class UserLoginResponse {

	private String emailId;
	private String token;

	public String getEmilaId() {
		return emailId;
	}

	public void setEmilaId(String emilaId) {
		this.emailId = emilaId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}

