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

import com.example.magasin.models.Produit;
import com.example.magasin.services.GenericService;

@RestController
@RequestMapping("produits")
public class ProduitController {

	@Autowired
	private GenericService<Produit> service;
	
	@GetMapping()
	public List<Produit> getProduits() {
		return this.service.get();
	}
	
	@GetMapping("{id}")
	public Produit getProduitById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Produit saveProduit(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
	
	@PatchMapping()
	public Produit update(@RequestBody Produit produit) {
		return this.service.update(produit);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}
