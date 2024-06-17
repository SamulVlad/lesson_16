package com.samul.javaсorelessons.lesson15.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainStation {
	private List<Train> trains = new ArrayList<Train>();

	public TrainStation() {
	}

	public TrainStation(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public void addTrain(Train train) {
		this.trains.add(train);
	}

	public void sortTrainsByNumber() {

		TrainComporator tc = new TrainComporator(TrainComporator.SORT_BY_TRAIN_NUMBER);
		Collections.sort(this.trains, tc);

	}

	public void sortTrainsByDestinationAndTime() {

		TrainComporator tc = new TrainComporator(TrainComporator.SORT_BY_DESTINATION_AND_TIME);
		Collections.sort(this.trains, tc);

	}

	public Train findTrainByNumber(String param) {
		
		for (Train elem : trains) {
			if(elem.getTrainNumber().equalsIgnoreCase(param)) {
				return elem;
			}
		}
		
		return null;
	}
	
	public void printTrainByNumber(String param) {
		
		Train tr = findTrainByNumber(param);
		
		if (tr == null) {
			System.out.println("No such train number!");
		} else {
			tr.printTrainInfo();
		}
	}
	
	public void printTrains() {
		
		System.out.println("-------------------------------------------------");
		System.out.printf("|%7s\t|%10s\t|%10s\t|\n", "Train №", "Destination","Dep. time");
		System.out.println("-------------------------------------------------");

		for (Train elem : trains) {
			System.out.printf("|%7s\t|%10s\t|%tT\t|\n", elem.getTrainNumber(), elem.getDestinationName(),elem.getDepatureTime());
		}

		System.out.println("-------------------------------------------------");
	}

}
