package com.air.domain;

import java.sql.Date;

public class FlightDetails {
	
	private long flightid;	
	private String carrier;
	private String starting;
	private String destination;
	private String typeofClass;
	private String timeofdeparture;
	private String Image;
	private int seatscount;
	private long fare;
	private int stops;
	private Date journeyDate;
	private String destinationTime;
	private int passCount;
	

	public int getPassCount() {
		return passCount;
	}

	public void setPassCount(int passCount) {
		this.passCount = passCount;
	}

	public String getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public void setStarting(String starting) {
		this.starting = starting;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setTypeofClass(String typeofClass) {
		this.typeofClass = typeofClass;
	}

	public void setTimeofdeparture(String timeofdeparture) {
		this.timeofdeparture = timeofdeparture;
	}

	public void setImage(String image) {
		Image = image;
	}

	public void setSeatscount(int seatscount) {
		this.seatscount = seatscount;
	}

	public void setFare(long fare) {
		this.fare = fare;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public long getFlightid() {
		return flightid;
	}

	public String getCarrier() {
		return carrier;
	}

	public String getStarting() {
		return starting;
	}

	public String getDestination() {
		return destination;
	}

	public String getTypeofClass() {
		return typeofClass;
	}

	public String getTimeofdeparture() {
		return timeofdeparture;
	}

	public String getImage() {
		return Image;
	}

	public int getSeatscount() {
		return seatscount;
	}

	public long getFare() {
		return fare;
	}

	public int getStops() {
		return stops;
	}

	public FlightDetails(long flightid, String carrier, String starting,
			String destination, String typeofClass, String timeofdeparture,
			String image, int seatscount, long fare, int stops,
			Date journeyDate, String destinationTime, int passCount) {
		super();
		this.flightid = flightid;
		this.carrier = carrier;
		this.starting = starting;
		this.destination = destination;
		this.typeofClass = typeofClass;
		this.timeofdeparture = timeofdeparture;
		Image = image;
		this.seatscount = seatscount;
		this.fare = fare;
		this.stops = stops;
		this.journeyDate = journeyDate;
		this.destinationTime = destinationTime;
		this.passCount = passCount;
	}

	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Image == null) ? 0 : Image.hashCode());
		result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result
				+ ((destinationTime == null) ? 0 : destinationTime.hashCode());
		result = prime * result + (int) (fare ^ (fare >>> 32));
		result = prime * result + (int) (flightid ^ (flightid >>> 32));
		result = prime * result
				+ ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + passCount;
		result = prime * result + seatscount;
		result = prime * result
				+ ((starting == null) ? 0 : starting.hashCode());
		result = prime * result + stops;
		result = prime * result
				+ ((timeofdeparture == null) ? 0 : timeofdeparture.hashCode());
		result = prime * result
				+ ((typeofClass == null) ? 0 : typeofClass.hashCode());
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
		FlightDetails other = (FlightDetails) obj;
		if (Image == null) {
			if (other.Image != null)
				return false;
		} else if (!Image.equals(other.Image))
			return false;
		if (carrier == null) {
			if (other.carrier != null)
				return false;
		} else if (!carrier.equals(other.carrier))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (destinationTime == null) {
			if (other.destinationTime != null)
				return false;
		} else if (!destinationTime.equals(other.destinationTime))
			return false;
		if (fare != other.fare)
			return false;
		if (flightid != other.flightid)
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (passCount != other.passCount)
			return false;
		if (seatscount != other.seatscount)
			return false;
		if (starting == null) {
			if (other.starting != null)
				return false;
		} else if (!starting.equals(other.starting))
			return false;
		if (stops != other.stops)
			return false;
		if (timeofdeparture == null) {
			if (other.timeofdeparture != null)
				return false;
		} else if (!timeofdeparture.equals(other.timeofdeparture))
			return false;
		if (typeofClass == null) {
			if (other.typeofClass != null)
				return false;
		} else if (!typeofClass.equals(other.typeofClass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightDetails [flightid=");
		builder.append(flightid);
		builder.append(", carrier=");
		builder.append(carrier);
		builder.append(", starting=");
		builder.append(starting);
		builder.append(", destination=");
		builder.append(destination);
		builder.append(", typeofClass=");
		builder.append(typeofClass);
		builder.append(", timeofdeparture=");
		builder.append(timeofdeparture);
		builder.append(", Image=");
		builder.append(Image);
		builder.append(", seatscount=");
		builder.append(seatscount);
		builder.append(", fare=");
		builder.append(fare);
		builder.append(", stops=");
		builder.append(stops);
		builder.append(", journeyDate=");
		builder.append(journeyDate);
		builder.append(", destinationTime=");
		builder.append(destinationTime);
		builder.append(", passCount=");
		builder.append(passCount);
		builder.append("]");
		return builder.toString();
	}
	
}
