package com.softtek.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.web.app.entity.Course.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	@Query("SELECT c FROM Course c WHERE  c.cveCourse=:cveCourse")
	public Course findByCveCourse(Long cveCourse);
}
