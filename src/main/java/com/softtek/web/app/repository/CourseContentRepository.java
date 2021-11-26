package com.softtek.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.Course.CourseContents;


@Repository
public interface CourseContentRepository extends JpaRepository<CourseContents, Long> {
	@Query("SELECT cc FROM CourseContents cc WHERE cc.cveContent =:cveContent")
	public CourseContents findByCVE(Long cveContent);

}
