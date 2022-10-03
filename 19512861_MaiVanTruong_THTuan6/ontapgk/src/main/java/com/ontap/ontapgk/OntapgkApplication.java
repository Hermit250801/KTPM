package com.ontap.ontapgk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OntapgkApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(OntapgkApplication.class, args);
	}

}
