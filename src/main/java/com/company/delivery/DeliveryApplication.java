package com.company.delivery;

import com.company.delivery.controllers.SalesmanController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);

		SalesmanController salesmanController = new SalesmanController();

		System.out.println(salesmanController.status());
	}

}
