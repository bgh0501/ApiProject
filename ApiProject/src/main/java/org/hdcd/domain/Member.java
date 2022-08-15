package org.hdcd.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Member {

	private String userId = "hongkd";
	private String password = "1234";
	private int coin;
	private List<Card> cardList;
	
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

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", coin=" + coin + ", cardList=" + cardList
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}
	
}
