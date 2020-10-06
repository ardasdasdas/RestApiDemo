package com.restapidemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapidemo.model.Student;
import com.restapidemo.service.StudentService;

@RestController
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("list/students")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> ilacList = studentService.findStudents();
		return ResponseEntity.ok(ilacList);
	}

	@GetMapping("list/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		Student student = studentService.findStudentById(id);
		return ResponseEntity.ok(student);
	}

	@PostMapping("add/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return ResponseEntity.ok(student);
	}

	@DeleteMapping("delete/students")
	public ResponseEntity<String> deleteAllStudents() {
		return new ResponseEntity<>(studentService.deleteAllStudents(), HttpStatus.OK);
	}

	@DeleteMapping("delete/students/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(studentService.deleteStudentById(id), HttpStatus.OK);
	}

	@PutMapping("update/students/{id}")
	public ResponseEntity<String> updateStudentByID(@RequestBody Student student, @PathVariable("id") Long id) {
		return new ResponseEntity<>(studentService.updateStudentById(student, id), HttpStatus.OK);
	}
}
