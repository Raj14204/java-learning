package com.prathamesh.SpringJDBCDemo;

import com.prathamesh.SpringJDBCDemo.model.Alien;
import com.prathamesh.SpringJDBCDemo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("raj");
		alien1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class); //obj
		repo.save(alien1); //saving obj

		System.out.print(repo.findAll());
	}

}
