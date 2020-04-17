package se.magnus.microservices.core.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import se.magnus.microservices.core.product.services.FakeController;

@SpringBootApplication
@ComponentScan(basePackages = {"se.magnus.microservices.core.product", "se.magnus.util.http", "se.magnus.util.exceptions", "se.magnus.api.core.product"})
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
