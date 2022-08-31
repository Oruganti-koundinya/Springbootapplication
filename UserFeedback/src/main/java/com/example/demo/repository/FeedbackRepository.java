package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{
	
	
}
