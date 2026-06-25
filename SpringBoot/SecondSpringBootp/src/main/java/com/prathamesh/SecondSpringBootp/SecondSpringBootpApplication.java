package com.prathamesh.SecondSpringBootp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondSpringBootpApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SecondSpringBootpApplication.class, args);
//		Dev obj =new Dev(); //we are creating manually
//		obj.build();
		//but in spring
		ApplicationContext context = SpringApplication.run(SecondSpringBootpApplication.class, args);
		Dev obj =context.getBean(Dev.class);
		obj.build();
	}

}
