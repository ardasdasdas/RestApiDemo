package com.restapidemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restapidemo.model.Course;

@Repository
public class CourseRepo {
	private List<Course> coursesList = new ArrayList<>();

	public void addCourse(Course course) {
		coursesList.add(course);
	}

	public Course findCourseById(String courseName) {
		for (Course course : coursesList) {
			if (course.getCourseName().equals(courseName))
				return course;
		}
		return null;
	}

	public List<Course> findAllCourses() {
		return coursesList;
	}

	public String deleteAllCourses() {
		String message = "Courses are deleted";
		coursesList.removeAll(coursesList);
		return message;
	}

	public String deleteCourseByName(String courseName) {
		String message = courseName + " is not found.";
		for (int i = 0; i < coursesList.size(); i++) {
			if (coursesList.get(i).getCourseName().equals(courseName)) {
				coursesList.remove(i);
				message = courseName + " is deleted.";
				return message;
			}
		}
		return message;
	}

}
