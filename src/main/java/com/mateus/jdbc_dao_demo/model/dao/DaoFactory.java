package com.mateus.jdbc_dao_demo.model.dao;

import com.mateus.jdbc_dao_demo.model.dao.impl.DepartmentDaoJDBC;
import com.mateus.jdbc_dao_demo.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC();
	}
}
