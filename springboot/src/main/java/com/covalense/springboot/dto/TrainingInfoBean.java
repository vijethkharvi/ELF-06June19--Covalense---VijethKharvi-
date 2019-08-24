package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="training_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean implements Serializable {
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public List<EmployeeInfoBean> getEmpInfoBeans() {
		return empInfoBeans;
	}

	public void setEmpInfoBeans(List<EmployeeInfoBean> empInfoBeans) {
		this.empInfoBeans = empInfoBeans;
	}

	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private String duration;
	@Column(name="course_type")
	private String courseType;
	
	//@JsonBackReference
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="training_info",
			   joinColumns= {@JoinColumn(name="course_id")},
			   inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> empInfoBeans;

}//end of TrainingInfoBean
