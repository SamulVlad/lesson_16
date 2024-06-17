package com.samul.javaсorelessons.lesson15.train;

import java.util.Date;

public class Train {
	private String destinationName;
	private String trainNumber;
	private Date depatureTime;
	
	public Train(String destinationName, String trainNumber, Date depatureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.depatureTime = depatureTime;
	}
	
	public String getTrainNumber() {
		return trainNumber;
	}
	

	public String getDestinationName() {
		return destinationName;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	public void printTrainInfo() {
		System.out.println("Train №: " + trainNumber + " | Destination: " + destinationName + " | " + depatureTime.getHours() + ":" + depatureTime.getMinutes());
		
	}


}
