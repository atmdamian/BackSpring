package com.softtek.web.app.service;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.dto.CourseDto;
import com.softtek.web.app.entity.Course.Course;
import com.softtek.web.app.entity.Course.CourseContents;
import com.softtek.web.app.repository.CourseContentRepository;
import com.softtek.web.app.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	CourseContentRepository courseContentRepository;


	@Override
	public Course findByCve(Long cveCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course saveCourseAndContents(CourseDto courseDto) {
		Course cours=new Course();
		cours.setCveCourse(courseDto.getCveCourse());
		cours.setContentName(courseDto.getContent());
		cours.setCourseContent(courseDto.getCourseContent().stream().map(x->{
			CourseContents ccDto =x;
			if(ccDto.getCveContent() >0) {
				ccDto =courseContentRepository.findByCVE(ccDto.getCveContent());
			}
			ccDto.getCouser().add(cours);
			return ccDto;
		}).collect(Collectors.toSet())
		);
		
		return courseRepository.save(cours);
	}

}
