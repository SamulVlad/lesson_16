package com.samul.javaсorelessons.lesson15.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

	public static void main(String[] args) {

		List<Student> std = new ArrayList<Student>();

		// Инициализируем студенов рандомными оценками
		std.add(new Student("Иванов", "Иван", "Ильич", "№1", new Integer[] { 5, 5, 5, 5, 5 }));
		std.add(new Student("Иванов", "Иван", "Ильич", "№1", new Integer[] { 5, 5, 5 }));
		std.add(new Student("Петроф", "Иоанн", "Иванович", "№1", new Integer[] { 5, 5, 5, 5, 5, 10 , 4, 9, 9, 9, 9 ,9 ,9 ,9 }));
		std.add(new Student("Сидорофф", "Илья", "Игнатьевич", "№1", new Integer[] { 5, 5, 5, 5 }));
		std.add(new Student("Степанов", "Игорь", "Израилович", "№1", new Integer[] { 3, 5, 6, 4, 8, 8, 8}));
		std.add(new Student("Абрамов", "Роман", "Аркадьевич", "№1", new Integer[] { 8, 7, 6, 3, 3 }));

		// Добавляем их в группу
		Group grp = new Group("№1", (ArrayList)std);

		// Двух студентов делаем отличниками
		grp.getStudents().get(1).setMarks(new Integer[] { 9, 9, 10, 10, 9 });
		grp.getStudents().get(2).setMarks(new Integer[] { 9, 9, 9 });

		// Печатаем всю группу
		grp.printGroup();

		// Печатаем отличников
		grp.printBestStudents();
		
		//Добавим еще студентов
		std = new ArrayList<Student>();
		std.add(new Student("Степанович", "Игорь", "Израилович", "№1", new Integer[] { 4, 5, 6, 4, 8, 8, 8}));
		std.add(new Student("Абрамович", "Роман", "Аркадьевич", "№1", new Integer[] { 9, 9, 9, 10, 10 }));
		
		grp.addStudents((ArrayList)std);
		// Печатаем всю группу
		grp.printGroup();

		// Печатаем отличников
		grp.printBestStudents();

	}

}
