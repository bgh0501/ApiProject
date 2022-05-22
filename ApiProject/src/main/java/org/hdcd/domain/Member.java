package org.hdcd.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Member {

	private String userId;
	private String password;
	private int coin;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	private Address address;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", getUserId()="
				+ getUserId() + ", getPassword()=" + getPassword() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
