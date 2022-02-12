package com.luv2code.servletdemo.mvc2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	
	public static List<Student> getStudents(){
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Filip", "Velkovski", "f12345velko@gmail.com"));
		students.add(new Student("Dare", "Smilkovski", "daresmilko12@gmali.com"));
		students.add(new Student("Alek", "Samardziev", "samardziev_alek22@gmail.com"));
		students.add(new Student("Elena", "Dejanovska", "dejanovskae_234@gmail.com"));
		
		// return the list
		return students;
	}
}
