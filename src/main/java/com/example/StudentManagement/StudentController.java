package com.example.StudentManagement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
	
	 Map <Integer,Student> db = new HashMap<>();
     
     @GetMapping("/get_student")
     public Student getStudent(@RequestParam("q") int id) {
    	 return db.get(id);
     }
     
     @PostMapping("/add_student")
     public String addStudent(@RequestBody Student student) {
    	 int id = student.getId();
    	 db.put(id, student);
    	 return "student added successfully";
     }
}
