package com.assignment.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@NotNull(message = "first name cannot be empty")
	@Size(min = 2,message = "first name less than 2 characters")
	@Pattern(regexp = "^[a-zA-Z][\\w -]*", message = ": First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name")
	private String firstName;
	
	@NotEmpty(message = "last name cannot be empty")
	@Size(min = 2, message = "last name less than 2 characters")
	@Pattern(regexp = "^[a-zA-Z][\\w -]*", message = "Last Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Last Name.")
	private String lastName;
	
	@Pattern(regexp = "^[a-zA-Z][\\w -]*", message = "Middle Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Middle Name.")
	private String middleName;
	
	@NotNull(message = "address cannot be empty")
	@Column
	private String address ;
	
	@NotEmpty(message = "city cannot be empty")
	@Pattern(regexp = "^[a-zA-Z][\\w -]*", message = "City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.")
	@Column
	private String city ;
	
	@NotEmpty(message = "Please specify state.")
	@Column
	private String state ;
	
	@NotEmpty(message = "Please specify country.")
	@Column
	private String country ;
	
	@Pattern(regexp = "[0-9]{10}", message = "Phone number contains 10 digits. Please enter a valid Phone number")
	@Column(name = "pno")
	private String phoneNumber ;
	
	@Column
	private String bankName ;
	
	@Column(name = "bankaccount")
	private String account ;
	
	private String ssn ;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Column(name = "firstname")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "lastname")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "middlename")
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Info [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", gender="
			 + ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", phoneNumber=" + phoneNumber + ", bankName=" + bankName + ", account=" + account + ", ssn=" + ssn
				+ "]";
	}

	
}
