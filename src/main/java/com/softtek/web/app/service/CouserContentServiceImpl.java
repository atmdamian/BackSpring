package com.softtek.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.web.app.entity.Course.CourseContents;
import com.softtek.web.app.repository.CourseContentRepository;

@Service
public class CouserContentServiceImpl implements CouserContentService {

	@Autowired
	CourseContentRepository courseContentRepository;
	
	@Override
	public CourseContents findByCve(Long cveContent) {
		// TODO Auto-generated method stub
		return null;
	}

}
