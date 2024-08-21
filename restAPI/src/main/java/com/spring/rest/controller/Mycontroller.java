package com.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entity.course;
import com.spring.rest.services.courseservices;

@RestController
public class Mycontroller {
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@Autowired
	private courseservices  courseservice;
		
	
	
	
	
	@GetMapping("/courses")
	public List <course> getCourses()
	{
		
		 
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public List <course> getCourse(@PathVariable String courseId)
	{
		
		 
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public course addCourse(@RequestBody course course) {
		
		return this.courseservice.addCourse(course);
	}
	
	 @PutMapping("/courses")
	    public course UpdateCourse(@RequestBody course courseToUpdate) {
	        return this.courseservice.UpdateCourse(courseToUpdate);
	    }
	 @DeleteMapping("/courses/{courseId}")
	    public course DeleteCourse(@PathVariable String courseId) {
	        return this.courseservice.DeleteCourse(Long.parseLong(courseId));
	    }
	 
	 
	 
		/*
		 * @DeleteMapping("/courses/{courseId}") public course
		 * DeleteCourse(@PathVariable String courseId) { return
		 * this.courseservice.DeleteCourse(Long.parseLong(courseId)); }
		 */
	 
/*	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
*/
	
	//System.out.println("hello I am controller");
}
