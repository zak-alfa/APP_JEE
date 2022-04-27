package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

@RestController
@RequestMapping("/emsi_api/livres")
public class LivreController {
	@Autowired
	LivreService livreService;
	
	@GetMapping("/List")
	public List<Livre> getAll() {
	return livreService.findbytitle();
	}
	@GetMapping("/{id}")
	public Livre getLivre(@PathVariable long id) {
		return livreService.getLivre(id);
	}
	@DeleteMapping("/{id}")
	public void deleteLivre(@PathVariable long id) {
	livreService.deleteLivre(id);
	}
	@PutMapping("/{id}")
	public void modifieLivre(@PathVariable long id, @RequestBody Livre l) {
	livreService.modifier(id, l);
	}
	@PostMapping
	public Livre create(@RequestBody Livre livre) {
	// TODO Auto-generated method stub
	return livreService.create(livre);

	 }

}
