package com.restapidemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapidemo.model.Course;
import com.restapidemo.model.Student;
import com.restapidemo.repository.CourseRepo;
import com.restapidemo.repository.StudentRepo;

@Service
public class StudentService {
	private StudentRepo studentRepo;
	private CourseRepo courseRepo;

	public StudentService(StudentRepo studentRepo, CourseRepo courseRepo) {
		this.studentRepo = studentRepo;
		this.courseRepo = courseRepo;
	}

	public void addStudent(Student student) {
		studentRepo.addStudent(student);
		for (Course course : student.getCourses()) {
			courseRepo.addCourse(course);
		}
	}

	public List<Student> findStudents() {
		return studentRepo.findAllStudents();
	}

	public Student findStudentById(Long id) {
		return studentRepo.findStudentByID(id);
	}

	public String deleteAllStudents() {
		return studentRepo.deleteAllStudents();
	}

	public String deleteStudentById(Long id) {
		return studentRepo.deleteStudentById(id);
	}

	public String updateStudentById(Student student, Long id) {
		return studentRepo.updateStudentById(student, id);
	}
}
