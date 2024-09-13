package vau.ac.lk.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private String empId;
	private String name;
	private String jobCategory;
	private String staffStatus;
	@ManyToOne
	private Site sites;
	public Employee() {
		super();
	}
	
	public Employee(String empId, String name, String jobCategory, String staffStatus, Site sites) {
		super();
		this.empId = empId;
		this.name = name;
		this.jobCategory = jobCategory;
		this.staffStatus = staffStatus;
		this.sites = sites;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getStaffStatus() {
		return staffStatus;
	}
	public void setStaffStatus(String staffStatus) {
		this.staffStatus = staffStatus;
	}

	public Site getSites() {
		return sites;
	}

	public void setSites(Site sites) {
		this.sites = sites;
	}
	
	

}
