package com.simplilearn.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Director;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Integer> {
	
	public Optional<Director> findDirectorByDirectorName(@Param("directorName") String directorName);
	
}
