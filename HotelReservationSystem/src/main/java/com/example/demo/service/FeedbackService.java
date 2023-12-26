package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Feedback;

public interface FeedbackService {

	//add to Favorite
	public Feedback addFeedback(Feedback feedback);
	
	//get All Favorite
	public List<Feedback> getAllFeedbackByEmail(String email);
	
	//getFavoriteById
	public Feedback getFeedbackById(long id);
	
	//delete Favorite
	public void deleteFeedbackById(long id);

	List<Feedback> getFeedback();
}