package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootTest
class S02springdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}
	
	@Test
	void saveProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setName("Acer Predator");
		product.setDescription("Gaming laptop");
		product.setPrice(4590);
		
		repo.save(product);
		
	}
	
	@Test
	void deleteProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		repo.deleteById(3);
		
	}
	@Test
	void findByName() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		List<Product> products = repo.findByName("Samsung S22ultra");
		System.out.println(products);
	}
	@Test
	void updateProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		Optional<Product> optionalProduct = repo.findById(5);
		Product product = null;
		if (optionalProduct.isPresent()) {
			product = optionalProduct.get();
			System.out.println(product);
		}
		if (product != null) {
			product.setPrice(64500);
			repo.save(product);
		}
	}
}
