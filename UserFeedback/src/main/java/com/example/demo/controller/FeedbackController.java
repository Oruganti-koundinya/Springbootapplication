package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Feedback;
import com.example.demo.service.FeedbackService;

@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	
	@RequestMapping("/index")
	public String feedback() {
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addNewFeedback(@ModelAttribute Feedback fb, ModelMap m) {
		System.out.println(fb);
		Feedback newFb = new Feedback(fb.getId(),  fb.getName(), fb.getEmailid(), fb.getRating(), fb.getFeedback());
	
		feedbackService.addNewFeedback(newFb);
		m.addAttribute("Feedback", fb);
		return "feedback";

	}
}
