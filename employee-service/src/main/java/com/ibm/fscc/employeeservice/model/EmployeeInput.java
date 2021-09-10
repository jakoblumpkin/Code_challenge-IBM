package com.ibm.fscc.employeeservice.model;

import java.util.Objects;

public class EmployeeInput {

	private String userId; // Generate with UUID and unique
	private String firstName;
	private String lastName;
	private String address; 
	private String state;
	private String zip;
	private String cellPhone;
	private String homePhone;
	private String email;// Unique

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, cellPhone, email, firstName, homePhone, lastName, state,  userId, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInput other = (EmployeeInput) obj;
		return Objects.equals(address, other.address) && Objects.equals(cellPhone, other.cellPhone)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(homePhone, other.homePhone) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(userId, other.userId) && Objects.equals(zip, other.zip);
	}
	@Override
	public String toString() {
		return "EmpolyeeInput [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", state=" + state + ", zip=" + zip + ", cellPhone=" + cellPhone + ", homePhone="
				+ homePhone + ", email=" + email + "]";
	}
	
	
}
