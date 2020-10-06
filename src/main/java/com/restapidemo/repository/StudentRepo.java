package com.restapidemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restapidemo.model.Student;

@Repository
public class StudentRepo {
	private List<Student> studentList = new ArrayList<>();

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public Student findStudentByID(Long id) {
		for (Student student : studentList) {
			if (student.getId().equals(id))
				return student;
		}
		return null;
	}

	public List<Student> findAllStudents() {
		return studentList;
	}

	public String deleteAllStudents() {
		String message = "Students are deleted";
		studentList.removeAll(studentList);
		return message;
	}

	public String deleteStudentById(Long id) {
		String message = "Student with " + id + "id not found.";
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				studentList.remove(i);
				message = "Student with " + id + " id is deleted.";
				return message;
			}
		}
		return message;
	}

	public String updateStudentById(Student student, Long id) {
		String message = "Student with " + id + "id not found.";
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				studentList.get(i).setStudentName(student.getStudentName());
				studentList.get(i).setCourses(student.getCourses());
				message = "Student with " + id + " id is uptated.";
				return message;
			}
		}
		return message;
	}
}
