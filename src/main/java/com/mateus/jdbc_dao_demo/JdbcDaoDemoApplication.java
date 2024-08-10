package com.mateus.jdbc_dao_demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mateus.jdbc_dao_demo.model.dao.DaoFactory;
import com.mateus.jdbc_dao_demo.model.dao.SellerDao;
import com.mateus.jdbc_dao_demo.model.entities.Department;
import com.mateus.jdbc_dao_demo.model.entities.Seller;

@SpringBootApplication
public class JdbcDaoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcDaoDemoApplication.class, args);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 : Seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
