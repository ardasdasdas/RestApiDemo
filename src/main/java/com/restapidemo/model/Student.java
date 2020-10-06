package com.restapidemo.model;

import java.util.List;

public class Student {
	private Long id;
	private String studentName;
	private List<Course> courses;

	public Student() {
	}

	public Student(Long id, String studentName, List<Course> courses) {
		this.id = id;
		this.studentName = studentName;
		this.courses = courses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
