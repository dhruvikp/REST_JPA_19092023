package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

	public List<Movie> findMovieByName(@Param("name") String name);

	// HQL Query
	@Query("select movie from Movie movie left join Director director on movie.director.id = director.id where director.directorName = :directorName")
	public List<Movie> findByDirectorName(@Param("directorName") String directorName);
}

/*
 * SQL-- select * from Movie_Table mt Left join Director_table dt on mt.id =
 * dt.movie_id
 * 
 * 
 * select movie from Movie movie left join Director director on
 * movie.director.id = director.id where director.directorName = :directorName
 * 
 */