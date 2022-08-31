package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "emailid")
	private String emailid;
	
	@Column(name = "rating")
	private String rating;
	
	@Column(name = "feedback")
	private String feedback;
	
	public Feedback() {}

	public Feedback(int id, String name, String emailid, String rating, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.rating = rating;
		this.feedback = feedback;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", emailid=" + emailid + ", rating=" + rating + ", feedback="
				+ feedback + "]";
	}
	
	
}
