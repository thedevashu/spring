package com.project.FirstWebProject;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class FirstWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebProjectApplication.class, args);
		System.out.println("started");
	}
	
	@Bean
	public DataSource getDataSource() 
	{
		DriverManagerDataSource dmds =new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/advjava");
		dmds.setUsername("root");
		dmds.setPassword("root");
		System.out.println("Connected with mysql");
		return dmds;
	}

}
