package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookRoomEntity
{
	@Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String userEmail;
	
	@Column
	private long roomId;
	
	@Column
	private int cost;
	
	@Column
	private String paymentMethod;
	
	@Column
	private long debitCardNumber;
	
//	@Column
//	private String cardWonerName;
//	
	@Column
	private int cvv;
	
//	@Column
//	private int month;
//	
//	@Column
//	private int year;

	@Column
	private String bankName;
	
//	@Column
//	private String bankBranch;
	
	@Column
	private String bankAccountHolderName;
	
	@Column
	private long accountNumber;
	
//	@Column
//	private String upi;
	
//	@Column
//	private String googlePayUserName;
	
	@Column
	private String date;
	

	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public long getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(long debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

//	public String getCardWonerName() {
//		return cardWonerName;
//	}
//
//	public void setCardWonerName(String cardWonerName) {
//		this.cardWonerName = cardWonerName;
//	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

//	public int getMonth() {
//		return month;
//	}
//
//	public void setMonth(int month) {
//		this.month = month;
//	}

//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

//	public String getBankBranch() {
//		return bankBranch;
//	}
//
//	public void setBankBranch(String bankBranch) {
//		this.bankBranch = bankBranch;
//	}

	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}

	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

//	public String getUpi() {
//		return upi;
//	}
//
//	public void setUpi(String upi) {
//		this.upi = upi;
//	}
//
//	public String getGooglePayUserName() {
//		return googlePayUserName;
//	}
//
//	public void setGooglePayUserName(String googlePayUserName) {
//		this.googlePayUserName = googlePayUserName;
//	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookRoomEntity [userEmail=" + userEmail + ", roomId=" + roomId + ", cost=" + cost
				+ ", paymentMethod=" + paymentMethod + ", debitCardNumber=" + debitCardNumber + ", cvv=" + cvv + ",  bankName=" + bankName
				+ ",  bankAccountHolderName=" + bankAccountHolderName + ", accountNumber="
				+ accountNumber + ",   date=" + date + "]";
	}
	public BookRoomEntity() {
		super();
	}

	
	
}