package com.in28minutes.spring.aop.springaop;

import com.in28minutes.spring.aop.springaop.Business.Business1;
import com.in28minutes.spring.aop.springaop.Business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication  implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	/*
	  Earlier we used to get app context and then retrieve bean for calling business logic.
	  But, with in SpringBoot run() method of interface CommandLineRunner of there is no
	  need of that it's damn easy :).
	*/

	@Override
	public void run(String... args) throws Exception {

		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());

	}
}
