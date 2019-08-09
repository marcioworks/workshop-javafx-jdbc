package model.services;

import java.util.List;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = Daofactory.createDepartmentDao();
	
	public List<Department> findAll(){
		return dao.findAll();
	}
}
