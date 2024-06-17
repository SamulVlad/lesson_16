package com.samul.javaсorelessons.lesson15.train;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TrainStation trs = new TrainStation();

		trs.addTrain(new Train("Gomel", "GM120", new Date(0, 0, 0, 10, 10)));
		trs.addTrain(new Train("Mogilev", "MG130", new Date(0, 0, 0, 11, 15)));
		trs.addTrain(new Train("Grodno", "GR140", new Date(0, 0, 0, 12, 30)));
		trs.addTrain(new Train("Brest", "BR150", new Date(0, 0, 0, 13, 20)));
		trs.addTrain(new Train("Brest", "BR151", new Date(0, 0, 0, 13, 55)));
		trs.addTrain(new Train("Vitebsk", "VT160", new Date(0, 0, 0, 14, 55)));
		trs.addTrain(new Train("Brest", "BR153", new Date(0, 0, 0, 13, 45)));

		Scanner sc = new Scanner(System.in);
		int i;

		do {
			showMenu();
			i = sc.nextInt();
			System.out.println();

			if (i == 1) {
				trs.printTrains();
			} else if (i == 2) {
				trs.sortTrainsByNumber();
			} else if (i == 3) {
				trs.sortTrainsByDestinationAndTime();
			} else if (i == 4) {
				System.out.print("Enter train number: ");
				String trNum = sc.next();
				trs.printTrainByNumber(trNum);
			} else if (i == 0) {
				return;

			}

		} while (true);

	}

	private static void showMenu() {
		System.out.println("\n\n++++++++++++++ MENU ++++++++++++++++++++");
		System.out.println("1. Print trains");
		System.out.println("2. Sort trains by number");
		System.out.println("3. Sort trains by destination and time");
		System.out.println("4. Print train information");
		System.out.println("0. Exit");
		System.out.print(">>");

	}

}
