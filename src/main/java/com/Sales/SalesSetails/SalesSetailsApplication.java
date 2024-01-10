package com.Sales.SalesSetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin(origins = "https://659c331662d228008e1954e2--statuesque-crisp-a2214d.netlify.app/")

public class SalesSetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesSetailsApplication.class, args);
	}

}
