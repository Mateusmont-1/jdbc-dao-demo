package com.mateus.jdbc_dao_demo;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 : Seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== TEST 2 : Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3 : Seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 4 : Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 5 : Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Updated! Seller id " + seller.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 6 : Seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
}
