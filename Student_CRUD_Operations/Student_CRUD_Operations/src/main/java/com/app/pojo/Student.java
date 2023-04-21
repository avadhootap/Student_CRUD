package com.app.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@JsonProperty("FirstName")
@Column(name = "FirstName")
private String fName;

@JsonProperty("LastName")
@Column(name = "LastName")
private String lName;

@Column(name = "EmailId")
private String emailId;

@Column(name = "Mobile")
private Long mobileNo;


public Student() {  
	super();
}


public Student(Long id, String fName, String lName, String emailId, Long mobileNo) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.emailId = emailId;
	this.mobileNo = mobileNo;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getfName() {
	return fName;
}


public void setfName(String fName) {
	this.fName = fName;
}


public String getlName() {
	return lName;
}


public void setlName(String lName) {
	this.lName = lName;
}


public String getEmailId() {
	return emailId;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}


public Long getMobileNo() {
	return mobileNo;
}


public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}


@Override
public String toString() {
	return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", emailId=" + emailId + ", mobileNo="
			+ mobileNo + "]";
}
	

}
