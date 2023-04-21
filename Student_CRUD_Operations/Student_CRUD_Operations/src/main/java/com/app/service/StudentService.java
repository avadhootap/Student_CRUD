package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService  {
	
	List<Student>getAllStudent();
	
	Student addStudent(Student addStudent);
	
	Student updateStudent(Student updateStudent);
	
	String deleteStudent(Long id);

}
