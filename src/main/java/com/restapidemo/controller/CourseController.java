package com.restapidemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapidemo.model.Course;
import com.restapidemo.service.CourseService;

@RestController
public class CourseController {
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping("list/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> etkenMaddeler = courseService.findAllCourses();
		return ResponseEntity.ok(etkenMaddeler);
	}

	@GetMapping("list/courses/{courseName}")
	public ResponseEntity<Course> getCourseByName(@PathVariable("courseName") String courseName) {
		Course etkenMaddeler = courseService.findCourseByName(courseName);
		return ResponseEntity.ok(etkenMaddeler);
	}

	@PostMapping("add/course")
	public ResponseEntity<Course> addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
		return ResponseEntity.ok(course);
	}

	@DeleteMapping("delete/courses")
	public ResponseEntity<String> deleteAllCourses() {
		return new ResponseEntity<>(courseService.deleteAllCourses(), HttpStatus.OK);
	}

	@DeleteMapping("delete/courses/{courseName}")
	public ResponseEntity<String> deleteCourseByName(@PathVariable("courseName") String courseName) {
		return new ResponseEntity<>(courseService.deleteCourseByName(courseName), HttpStatus.OK);
	}
}
