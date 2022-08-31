package com.example.demo.exceptions;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(int id) {
		super("PRODUCT WITH ID " + id + " NOT FOUND.");
	}

}