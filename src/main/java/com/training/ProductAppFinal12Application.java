package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class ProductAppFinal12Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinal12Application.class, args);
		System.out.println("Created");
	}

}
