package com.codingdojo.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojo.models.Dojo;
import com.codingdojo.dojo.models.Ninja;
import com.codingdojo.dojo.repositories.DojoRepository;
import com.codingdojo.dojo.repositories.NinjaRepository;

@Service
public class AppService {
	@Autowired 
	private DojoRepository dRepo;
	@Autowired 
	private NinjaRepository nRepo;
	
	//GetAll Methods:
	public List <Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	
	public List <Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	
	
	//Create Methods:
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//Find Ninjas By Dojo Method Required:
	
	public Dojo findDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	
	
	

}
