package com.softtek.web.app.entity.Course;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_CONTENTS")
public class CourseContents implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_CONTENT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cveContent;
	
	private String content;
	
	@ManyToMany(mappedBy = "courseContent")
	private Set<Course> couser = new HashSet<>();

	public Long getCveContent() {
		return cveContent;
	}

	public void setCveContent(Long cveContent) {
		this.cveContent = cveContent;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<Course> getCouser() {
		return couser;
	}

	public void setCouser(Set<Course> couser) {
		this.couser = couser;
	}
	
}
