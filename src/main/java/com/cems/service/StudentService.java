package com.cems.service;

import java.util.List;

import com.cems.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
		
}
