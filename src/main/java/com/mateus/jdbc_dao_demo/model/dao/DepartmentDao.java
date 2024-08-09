package com.mateus.jdbc_dao_demo.model.dao;

import java.util.List;

import com.mateus.jdbc_dao_demo.model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
