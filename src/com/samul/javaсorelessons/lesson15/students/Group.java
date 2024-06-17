package com.samul.javaсorelessons.lesson15.students;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private String number;
	private List<Student> students = new ArrayList<Student>();

	public Group(String number, ArrayList<Student> students) {
		this.number = number;
		this.students = students;
	}
	

	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}


	public ArrayList<Student> getStudents() {
		return (ArrayList)this.students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudents(ArrayList<Student> students) {
		this.students.addAll(students);
	}


	public void printGroup() {
		
		System.out.println("\nГруппа: " + this.number);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.print((i+1) + ". ");
			students.get(i).print();
		}

	}

	public void printBestStudents() {
		
		System.out.println("\nЛучшие студенты в группе " + this.number + ": ");
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).isBest()) {
				students.get(i).print();
			}
		}

	}

}
