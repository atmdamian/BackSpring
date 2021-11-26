package com.softtek.web.app.service;

import com.softtek.web.app.dto.CourseDto;
import com.softtek.web.app.entity.Course.Course;

public interface CourseService {
	public Course findByCve(Long cveCourse);
	public Course saveCourseAndContents(CourseDto courseDto);

}
