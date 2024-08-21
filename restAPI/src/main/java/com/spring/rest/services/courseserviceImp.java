package com.spring.rest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.entity.course;

@Service
public class courseserviceImp implements courseservices {

    private List<course> list;

    public courseserviceImp() {
        // Initialize the list of courses in the constructor
        list = new ArrayList<>();
        list.add(new course(123, "java core course", "this course good"));
        list.add(new course(124, "java is best start to learn", "this course good"));
    }

    @Override
    public List<course> getCourses() {
        return list; // Return the list of courses
    }

    
    @Override
    public List<course> getCourse(Long courseId) {
        List<course> result = new ArrayList<>();
        for (course c : list) {
            if (c.getId() == courseId) {
                result.add(c);
                break; // If you want to return only one course with the given courseId, you can break the loop here
            }
        }
        return result;
    }

	@Override
	public course addCourse(course course) {
		list.add(course);
		return course;
	}

	@Override
	public course UpdateCourse(course course) {
		list.add(course);
		return course;
	}

	@Override
	public course DeleteCourse(long courseId) {
	    for (Iterator<course> iterator = list.iterator(); iterator.hasNext();) {
	        course c = iterator.next();
	        if (c.getId() == courseId) {
	            iterator.remove(); // Remove the course from the list
	            return c; // Return the deleted course
	        }
	    }
	    return null; // Indicate that the course with the specified ID was not found
	}


	/*@Override
	public List<course> getCourse(Long courseId) {
		course c = null;
		for( course course :list) {
			
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
    */
	
	
	
	
}
