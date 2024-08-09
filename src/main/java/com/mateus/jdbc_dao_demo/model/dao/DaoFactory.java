package com.mateus.jdbc_dao_demo.model.dao;

import com.mateus.jdbc_dao_demo.db.DB;
import com.mateus.jdbc_dao_demo.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
/*	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC();
	}*/
}
