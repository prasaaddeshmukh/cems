package com.cems.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cems.entity.Student;
import com.cems.repository.StudentRepository;
import com.cems.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;
	
	
public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
		
	}

}
