package com.uma.youtube2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.uma.youtube2.dao.AlienRepo;
import com.uma.youtube2.model.Alien;


@RestController 
public class AlignController {
	@Autowired 
	AlienRepo repo;
	
//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";	
//	}
	
	@DeleteMapping("alien/{aid}")    //this mapping is used to delete user  ///alien/{aid}//alien
	public String deleteAlien(@PathVariable int aid) {
		Alien a=repo.getOne(aid);
		repo.delete(a);
		return "deleted";
			
	}
	
	@PutMapping("alien")              //this mapping is used to update user or if user is not available it will register the user
	public Alien saveorupdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		
		return alien;
	}
	
	@PostMapping("alien")
	public String addAlien( @RequestBody Alien alien) {
		
		repo.save(alien);
		return "reg successfull";
		
	}
	
	@GetMapping(path="/aliens")
	public List<Alien> getAliens() {      
		return repo.findAll();	
	}
	
	@RequestMapping("/aliens/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid) {
		return repo.findById(aid);
			
	}
	
	
}
