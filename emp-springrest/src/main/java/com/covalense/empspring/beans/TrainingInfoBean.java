package com.covalense.empspring.beans;

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
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Entity
@Table(name = "training_info")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean implements Serializable{
	public Integer getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getDuration() {
		return duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public List<EmployeeInfo> getEmployeeInfo() {
		return employeeInfo;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public void setEmployeeInfo(List<EmployeeInfo> employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	
	@Id
	@Column(name="course_id")
	private Integer courseId; 
	@Column(name="course_name")
	private String courseName;
	@Column(name="duration")
	private String duration;
	@Column(name="course_type")
	private String courseType;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="employee_training_info",joinColumns= {@JoinColumn(name="course_id")},inverseJoinColumns= {@JoinColumn(name="id")})
	List<EmployeeInfo> employeeInfo;
	
}//end of TrainingInfoBean
