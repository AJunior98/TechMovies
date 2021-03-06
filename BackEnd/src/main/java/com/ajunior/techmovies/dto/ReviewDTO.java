package com.ajunior.techmovies.dto;

import javax.validation.constraints.NotBlank;

import com.ajunior.techmovies.entities.Movie;
import com.ajunior.techmovies.entities.Review;
import com.ajunior.techmovies.entities.User;

public class ReviewDTO {

	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String text;
	private User user;
	
	private Movie movie;
	
	public ReviewDTO() {
	}

	public ReviewDTO(Long id, String text, User user, Movie movie) {
		this.id = id;
		this.text = text;
		this.user = user;
		this.movie = movie;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		user = entity.getUser();
		movie = entity.getMovie();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}	
}
