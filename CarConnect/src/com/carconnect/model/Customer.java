package com.carconnect.model;

import java.time.LocalDate;

public class Customer {
	int customerID;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String username;
    String password;
    LocalDate registrationDate;
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerID, String firstName, String lastName, String email, String phoneNumber, String address,
			String username, String password, LocalDate registrationDate) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.username = username;
		this.password = password;
		this.registrationDate = registrationDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public void authenticatePassword(String password) {
		if(this.password.equals(password)) {
			System.out.println("Correct Password");
		} else {
		    System.out.println("Incorrect Password");
		}
	}
}
