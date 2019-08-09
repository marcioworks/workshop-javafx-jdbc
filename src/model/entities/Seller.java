package model.entities;

import java.util.Date;

public class Seller {

	private Integer id;
	private String name;
	private String email;
	private Date Birthdate;
	private Double baseSalary;
	private Department department;
	
	public Seller() {
		
	}

	

	public Seller(Integer id, String name, String email, Date birthdate, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		Birthdate = birthdate;
		this.baseSalary = baseSalary;
		this.department = department;
	}



	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", Birthdate=" + Birthdate + ", baseSalary="
				+ baseSalary + "]";
	}
	
	
	
}
