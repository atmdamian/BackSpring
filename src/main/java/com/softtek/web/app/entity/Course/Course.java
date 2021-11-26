package com.softtek.web.app.entity.Course;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.softtek.web.app.dto.CourseDto;

@Entity
@Table(name = "COURSE")
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_COURSE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveCourse;
	
	private String contentName;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="COURSE_CONTENT_MAPPING",
	joinColumns = @JoinColumn(name="CVE_COURSE"), 
	inverseJoinColumns =@JoinColumn(name ="CVE_CONTENT"))
	private Set<CourseContents> courseContent = new HashSet<>();
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(CourseDto curseDto) {
		super();
		this.cveCourse =curseDto.getCveCourse();
		this.contentName = curseDto.getContent();
		this.courseContent = curseDto.getCourseContent();
	}

	public Long getCveCourse() {
		return cveCourse;
	}

	public void setCveCourse(Long cveCourse) {
		this.cveCourse = cveCourse;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public Set<CourseContents> getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(Set<CourseContents> courseContent) {
		this.courseContent = courseContent;
	}
	

	
	
	
}
