package com.covalense.empspring.beans;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
//@XmlRootElement(name="employee-info-bean")
@JsonRootName(value="employee-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_info")
public class EmployeeInfo implements Serializable {
	
	//@XmlElement(name="other-info")
	@JsonProperty(value="other-info")
	@OneToOne(cascade=CascadeType.ALL,mappedBy="infobean")
	private EmployeeOtherInfo employeeOtherInfo;
	   
	//@XmlElement(name="address-info")
	@JsonProperty(value="address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL, mappedBy="addressPKBean.info")
	private List<EmployeeAddressInfo> addressinfo;
	
	//@XmlElement(name="education-info")
	@JsonProperty(value="education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL, mappedBy="educationInfoBean.info")
	private List<EmployeeEducationInfoBean> eduinfo;
	
	//@XmlElement(name="experience-info")
	@JsonProperty(value="experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade=CascadeType.ALL, mappedBy="employeeExperience.info")
	private List<EmployeeExperienceBean> empexp;
	
	
	
	public EmployeeOtherInfo getEmployeeOtherInfo() {
		return employeeOtherInfo;
	}

	public List<EmployeeAddressInfo> getAddressinfo() {
		return addressinfo;
	}

	public List<EmployeeEducationInfoBean> getEduinfo() {
		return eduinfo;
	}

	public List<EmployeeExperienceBean> getEmpexp() {
		return empexp;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Double getSalary() {
		return salary;
	}

	public Long getPhone() {
		return phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public Long getAccno() {
		return accno;
	}

	public String getEmail() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

	public Date getDob() {
		return dob;
	}

	public String getPassword() {
		return password;
	}

	public DeptInfoBean getDeptinfo() {
		return deptinfo;
	}

	public EmployeeInfo getMngrId() {
		return mngrId;
	}

	public void setEmployeeOtherInfo(EmployeeOtherInfo employeeOtherInfo) {
		this.employeeOtherInfo = employeeOtherInfo;
	}

	public void setAddressinfo(List<EmployeeAddressInfo> addressinfo) {
		this.addressinfo = addressinfo;
	}

	public void setEduinfo(List<EmployeeEducationInfoBean> eduinfo) {
		this.eduinfo = eduinfo;
	}

	public void setEmpexp(List<EmployeeExperienceBean> empexp) {
		this.empexp = empexp;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void setAccno(Long accno) {
		this.accno = accno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDeptinfo(DeptInfoBean deptinfo) {
		this.deptinfo = deptinfo;
	}

	public void setMngrId(EmployeeInfo mngrId) {
		this.mngrId = mngrId;
	}

	//@XmlElement(name="training-info")
	@JsonProperty(value="training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="employeeInfo")
	private List<TrainingInfoBean> trainingInfoBeans;
	

	//@XmlElement(name="id")
	@JsonProperty(value="ID")
	//@XmlElement(name="ID")
	@Id
	@Column(name = "id")
	private Integer id;

	//@XmlElement(name="Name")
	@Column(name = "name")
	private String name;
	
	//@XmlElement(name="Age")
	@Column(name = "age")
	private Integer age;

	//@XmlElement(name="Gender")
	@Column(name = "gender")
	private String gender;

	//@XmlElement(name="Salary")
	@Column(name = "salary")
	private Double salary;

	@Column(name = "phone")
	private Long phone;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "acount_number")
	private Long accno;

	@Column(name = "email")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "dob")
	private Date dob;
	
	@Column(name="password")
	private String password;
	
	//@XmlElement(name="dept-info")
	@JsonProperty(value="dept-info")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "Dept_id",referencedColumnName="Dept_id")
	private DeptInfoBean deptinfo;
	
	//@XmlTransient
	//@XmlElement(name="manager-id")
	@JsonProperty(value="manager-id")
	@ManyToOne
	@JoinColumn(name="manager_id",referencedColumnName="id")
	private EmployeeInfo mngrId;
	
	
}
