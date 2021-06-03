package com.example.magasin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.magasin.models.Categorie;
import com.example.magasin.services.GenericService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private GenericService<Categorie> service;
	
	@GetMapping()
	public List<Categorie> getCategories() {
		return this.service.get();
	}
	
	@GetMapping("{id}")
	public Categorie getCategorieById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}
	
	@PatchMapping()
	public Categorie update(@RequestBody Categorie categorie) {
		return this.service.update(categorie);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}
