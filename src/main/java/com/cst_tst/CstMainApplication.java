package com.cst_tst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CstMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CstMainApplication.class, args);
		System.out.println("Started");
	}
	
	
}
