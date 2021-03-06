package com.ajunior.techmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajunior.techmovies.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}