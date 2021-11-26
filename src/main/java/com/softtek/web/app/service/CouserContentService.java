package com.softtek.web.app.service;

import com.softtek.web.app.entity.Course.CourseContents;

public interface CouserContentService {
	public CourseContents findByCve(Long cveContent);
}
