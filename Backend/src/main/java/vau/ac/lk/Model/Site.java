package vau.ac.lk.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Site {
	@Id
	private String siteId;
	private String name;
	private String location;
	@OneToMany(mappedBy = "sites")
	private List<Employee> employees;
	public Site() {
		super();
	}

	public Site(String siteId, String name, String location, List<Employee> employees) {
		super();
		this.siteId = siteId;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}
