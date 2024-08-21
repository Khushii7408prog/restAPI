package com.spring.rest.services;

import java.util.List;

import com.spring.rest.entity.course;

public interface courseservices {

    public List<course> getCourses();
    
    public List<course> getCourse(Long courseId);

	public course addCourse(course course);

	
	
	public course UpdateCourse(course course);

	public course DeleteCourse(long courseId);
}
