package com.cems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cems.repository.StudentRepository;

@SpringBootApplication
public class CollegeEventManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CollegeEventManagementSystemApplication.class, args);
	}
 @Autowired
 private StudentRepository studentRepository;
 
 @Override
 public void run (String... args) throws Exception{ 
	
}
}