package com.samul.javaсorelessons.lesson15.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Student {
	private String lastName;
	private String firstName;
	private String midName;

	private String groupNumber;

	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String lastName, String firstName, String midName, String groupNumber, Integer[] marks) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.midName = midName;
		this.groupNumber = groupNumber;
		setMarks(marks);
	}

	public void setMarks(Integer[] param) {

		checkMarks(param);
		
		this.marks = new ArrayList<Integer>(Arrays.asList(param));
	}

	private void checkMarks(Integer[] param) {

		for (Integer elem : param) {
			if (elem < 0 || elem > 10) {
				throw new RuntimeException("Оценка находится за пределами допустимого диапазона (0..10)!");
			}
		}
		
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public boolean isBest() {
		boolean result = true;
		
		for (Integer elem : this.marks) {
			if (elem < 9) {
				result = false;
				break;
			}
		}

		return result;
	}

	public void print() {

		System.out.print(lastName + " " + firstName + " " + midName + ", Группа: " + groupNumber + " : Оценки: " + this.marks.toString());

		System.out.println();
	}

}
