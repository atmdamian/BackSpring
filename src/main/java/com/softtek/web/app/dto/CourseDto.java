package com.softtek.web.app.dto;

import java.util.HashSet;
import java.util.Set;

import com.softtek.web.app.entity.Course.CourseContents;

public class CourseDto {
	private Long cveCourse;
	
	private String content;
	private Set<CourseContents> courseContent = new HashSet<>();

	public Long getCveCourse() {
		return cveCourse;
	}

	public void setCveCourse(Long cveCourse) {
		this.cveCourse = cveCourse;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<CourseContents> getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(Set<CourseContents> courseContent) {
		this.courseContent = courseContent;
	}

}
