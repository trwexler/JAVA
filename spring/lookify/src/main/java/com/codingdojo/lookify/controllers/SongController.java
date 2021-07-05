package com.codingdojo.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

@Controller
public class SongController {
	
	//controller needs access to service
	private final SongService sService;
	
	//constructor
	public SongController(SongService service) {
		this.sService = service;
	}
	
	
	@RequestMapping("/lookify")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/lookify/dashboard")
	public String dashboard(Model model, @ModelAttribute("song") Song song) {
		model.addAttribute("allSongs", this.sService.allSongs());
		return "dashboard.jsp";
	}
	
	
	@GetMapping("/lookify/newsong")
	public String newSongPage(@ModelAttribute("song") Song song) {
		return "newsong.jsp";
	}
	
	@PostMapping("/lookify/newsong")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allSongs", this.sService.allSongs());
			return "dashboard.jsp";
		}
		this.sService.addSong(song);
		return "redirect:/lookify/dashboard";
	}
	
	
	@GetMapping("/lookify/song/{id}")
	public String songPage(Model model, @ModelAttribute("song") Song song, @PathVariable("id") Long id) {
		model.addAttribute("thisSong", this.sService.findSong(id));
		return "song.jsp";
	}
	
	@DeleteMapping("/lookify/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/lookify/dashboard";
	}
	
	
	@RequestMapping("/lookify/searched")
	public String Search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs",	sService.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "searched.jsp";
	}
	
	@RequestMapping("/lookify/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", sService.topTenByRating());
		return "topTen.jsp";
	}
	
	
	

}
