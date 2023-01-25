package com.example.StudentManagement;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentController2 {
	 Map <Integer,Student> db = new HashMap<>();
	
	 @PostMapping("/get_student")
     public Student getStudent(@RequestParam("q") int id) {
    	 return db.get(id);
     }
	 
	 public String addStudent(Student student) {
    	 int id = student.getId();
    	 db.put(id, student);
    	 return "student added successfully";
     }
	
}
