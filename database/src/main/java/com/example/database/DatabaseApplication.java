package com.example.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}",dao.findAll());
		logger.info("User id 1001 -> {}",dao.findById(1001));
	}

}
