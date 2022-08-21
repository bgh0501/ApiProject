package org.hdcd.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonFormat;

public class Member {

	private static final long serialVersionUID = 1710069820531371155L;
	
	//입력값 검증 규칙을 지정한다.
	@NotBlank
	private String userId;
	
	//여러개의 입력값 검증 규칙을 지정할 수 있다.
	@NotBlank
	@Size(max = 3)
	private String userName;
	
	private String email;
	private String gender;
	private String password;
	private int coin;
	private List<Card> cardList;
	
	//@JsonFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyyMMdd")
	private Date dateOfBirth;
	
	private Address address;
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

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
		return "Member [userId=" + userId + ", userName=" + userName + ", email=" + email + ", gender=" + gender
				+ ", password=" + password + ", coin=" + coin + ", cardList=" + cardList + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + "]";
	}

	
	
}
