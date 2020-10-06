package com.restapidemo.model;

public class Course {
	private String courseName;

	public Course() {
	}

	public Course(String className) {
		this.courseName = className;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
