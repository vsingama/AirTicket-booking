package com.air.domain;

import java.sql.Date;

public class BookingDetails {
	
	private String emailID;
	private int flightID;	
	private String confirmationID;
	private long userid;
	private String classtype;
	private int passcount;
	private Date date;
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getConfirmationID() {
		return confirmationID;
	}
	public void setConfirmationID(String confirmationID) {
		this.confirmationID = confirmationID;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	public int getPasscount() {
		return passcount;
	}
	public void setPasscount(int passcount) {
		this.passcount = passcount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BookingDetails(String emailID, int flightID, String confirmationID,
			long userid, String classtype, int passcount, Date date) {
		super();
		this.emailID = emailID;
		this.flightID = flightID;
		this.confirmationID = confirmationID;
		this.userid = userid;
		this.classtype = classtype;
		this.passcount = passcount;
		this.date = date;
	}
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((classtype == null) ? 0 : classtype.hashCode());
		result = prime * result
				+ ((confirmationID == null) ? 0 : confirmationID.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + flightID;
		result = prime * result + passcount;
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
		BookingDetails other = (BookingDetails) obj;
		if (classtype == null) {
			if (other.classtype != null)
				return false;
		} else if (!classtype.equals(other.classtype))
			return false;
		if (confirmationID == null) {
			if (other.confirmationID != null)
				return false;
		} else if (!confirmationID.equals(other.confirmationID))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (flightID != other.flightID)
			return false;
		if (passcount != other.passcount)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookingDetails [emailID=");
		builder.append(emailID);
		builder.append(", flightID=");
		builder.append(flightID);
		builder.append(", confirmationID=");
		builder.append(confirmationID);
		builder.append(", userid=");
		builder.append(userid);
		builder.append(", classtype=");
		builder.append(classtype);
		builder.append(", passcount=");
		builder.append(passcount);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
