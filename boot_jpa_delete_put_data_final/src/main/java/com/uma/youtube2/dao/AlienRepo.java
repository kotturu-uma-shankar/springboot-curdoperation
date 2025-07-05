package com.uma.youtube2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.uma.youtube2.model.Alien;

//jpa is the child of all the repositary containing all the features of previous and some more extera features also

public interface AlienRepo extends JpaRepository<Alien, Integer>//this has development methods
{
	
	
}
