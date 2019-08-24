package com.covalense.springboot.dto;

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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
//@XmlRootElement(name="employee-info")
@JsonRootName(value="employee-info")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	//@JsonManagedReference
	//@XmlElement(name="other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToOne(cascade=CascadeType.ALL,mappedBy = "empInfo")
	@JsonProperty(value="other-info")
	private EmployeeOtherInfoBean employeeOtherInfo;
	
	//@JsonManagedReference
	//@XmlElement(name="address-info")
	@JsonProperty(value="address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "addressPKBean.empInfo")
    private List<EmployeeAddressInfoBean> addressInfoBeans;
	
	//@JsonManagedReference
	//@XmlElement(name="education-info")
	@JsonProperty(value="education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empEducationInfo.empInfo")
    private List<EmployeeEducationalInfo> educationInfoBeans;
	
	//@JsonManagedReference
	//@XmlElement(name="experience-info")
	@JsonProperty(value="experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empPKBean.empInfo")
    private List<EmployeeExperienceInfoBean> experienceInfoBeans;
    
	//@JsonManagedReference
	//@XmlElement(name="training-info")
	@JsonProperty(value="training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "empInfoBeans")
    private List<TrainingInfoBean> trainingInfoBeans;
    
	
	//@XmlElement(name="id")     //if the field name and element name u want to give is same,then no need of using @xmlElement
	@Id
	@Column(name = "id")
	private int id;

	//@XmlElement(name="name")
	@Column(name = "name")
	private String name;

	//@XmlElement(name="age")
	@Column(name = "age")
	private int age;

	//@XmlElement(name="gender")
	@Column(name = "gender")
	private String gender;

	//@XmlElement(name="salary")
	@Column(name = "salary")
	private double salary;

	//@XmlElement(name="phone")
	@Column(name = "phone")
	private long phone;

	//@XmlElement(name="joining-date")
	@JsonProperty(value="joining-date")
	@Column(name = "joining_date")
	private Date joiningDate;

	//@XmlElement(name="account-number")
	@JsonProperty(value="account-number")
	@Column(name = "acount_number")
	private long accountNumber;

	//@XmlElement(name="email")
	@Column(name = "email")
	private String email;

	//@XmlElement(name="designation")
	@Column(name = "designation")
	private String designation;

	//@XmlElement(name="d-o-b")
	@Column(name = "dob")
	private Date dob;
	
	//@XmlElement(name="dept-id")
	@JsonProperty(value="dept-id")
    @ManyToOne
	@JoinColumn(name = "Dept_id",referencedColumnName = "Dept_id")
	private DepartmentInfoBean deptId;
	
	//@XmlElement(name="password")
	@Column(name = "password")
	private String password;
	
	//@XmlElement(name="mngr-id")
	@JsonProperty(value="manager-id")
	@ManyToOne
	@JoinColumn(name="manager_id",referencedColumnName = "id")
	private EmployeeInfoBean mngrId;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentInfoBean getDeptId() {
		return deptId;
	}

	public void setDeptId(DepartmentInfoBean deptId) {
		this.deptId = deptId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeInfoBean getMngrId() {
		return mngrId;
	}

	public void setMngrId(EmployeeInfoBean mngrId) {
		this.mngrId = mngrId;
	}

	public EmployeeOtherInfoBean getEmployeeOtherInfo() {
		return employeeOtherInfo;
	}

	public void setEmployeeOtherInfo(EmployeeOtherInfoBean employeeOtherInfo) {
		this.employeeOtherInfo = employeeOtherInfo;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBeans() {
		return addressInfoBeans;
	}

	public void setAddressInfoBeans(List<EmployeeAddressInfoBean> addressInfoBeans) {
		this.addressInfoBeans = addressInfoBeans;
	}

	public List<EmployeeEducationalInfo> getEducationInfoBeans() {
		return educationInfoBeans;
	}

	public void setEducationInfoBeans(List<EmployeeEducationalInfo> educationInfoBeans) {
		this.educationInfoBeans = educationInfoBeans;
	}

	public List<EmployeeExperienceInfoBean> getExperienceInfoBeans() {
		return experienceInfoBeans;
	}

	public void setExperienceInfoBeans(List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		this.experienceInfoBeans = experienceInfoBeans;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}

 
}
