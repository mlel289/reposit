package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		ClassA classA = appContext.getBean(ClassA.class);

		System.out.println(classA.getGreetings());


		callExternalService();


	}

	private void callExternalService() {

		RestTemplate restTemplate = new RestTemplate();
		String uri = "http://localhost:8080/product";
		Product product = new Product();
		product.setName("name1");
		Product response = restTemplate.postForObject(uri,product, Product.class);
		System.out.println(response.id);
		System.out.println(response.getName());
	}

}

