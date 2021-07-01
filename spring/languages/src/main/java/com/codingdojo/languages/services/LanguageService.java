package com.codingdojo.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	//need to grab info from Repo to have access to all of the CRUD + Added Methods
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	//need a method to FIND ALL LANGUAGES
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	
	//RETRIEVE ONE LANGUAGE:
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Create
	public Language createLanguage(Language newLang){
		return this.lRepo.save(newLang);
	}
	
	//Update
	public Language updateLanguage(Language updatedLang) {
		return this.lRepo.save(updatedLang);
	}
	
	//DELETE        VOID BECAUSE IT DOESN'T RETURN ANYTHING
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	

}
