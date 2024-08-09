package com.mateus.jdbc_dao_demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mateus.jdbc_dao_demo.model.entities.Department;
import com.mateus.jdbc_dao_demo.model.entities.Seller;

@SpringBootApplication
public class JdbcDaoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcDaoDemoApplication.class, args);
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}

}
