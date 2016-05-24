package com.air.domain;

public class Registration {

	private long userid;

	private String firstname;

	private String lastname;

	private String emailID;

	private String nationality;
	
	private long phonenum;
	
	private String passportnun;
	
	private String address;

	public Registration(){
		super();
	}
	
public Registration(long userid, String firstname, String lastname,
		String emailID, String nationality, long phonenum,
		String passportnun, String address) {
	super();
	this.userid = userid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailID = emailID;
	this.nationality = nationality;
	this.phonenum = phonenum;
	this.passportnun = passportnun;
	this.address = address;
}

public long getUserid() {
	return userid;
}

public String getFirstname() {
	return firstname;
}

public String getLastname() {
	return lastname;
}

public String getEmailID() {
	return emailID;
}

public String getNationality() {
	return nationality;
}

public long getPhonenum() {
	return phonenum;
}

public String getPassportnun() {
	return passportnun;
}

public String getAddress() {
	return address;
}

public void setUserid(long userid) {
	this.userid = userid;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public void setPhonenum(long phonenum) {
	this.phonenum = phonenum;
}

public void setPassportnun(String passportnun) {
	this.passportnun = passportnun;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (userid ^ (userid >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Registration other = (Registration) obj;
	if (userid != other.userid)
		return false;
	return true;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Reservation [userid=");
	builder.append(userid);
	builder.append(", firstname=");
	builder.append(firstname);
	builder.append(", lastname=");
	builder.append(lastname);
	builder.append(", emailID=");
	builder.append(emailID);
	builder.append(", nationality=");
	builder.append(nationality);
	builder.append(", phonenum=");
	builder.append(phonenum);
	builder.append(", passportnun=");
	builder.append(passportnun);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
}


}