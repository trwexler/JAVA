package com.codingdojo.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository sRepo;
	
	//CONSTRUCTOR
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	
	//Methods:
	
	public List<Song> allSongs(){
		return this.sRepo.findAll();
	}
	
	public Song findSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	public Song addSong(Song newSong) {
		return this.sRepo.save(newSong);
	}
	
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	
	public List<Song> topTenByRating() {
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	public List<Song> songsContainingArtist(String artist) {
		return sRepo.findByArtistContaining(artist);
	}
	
	
	

}
