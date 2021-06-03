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

import com.example.magasin.models.Commande;
import com.example.magasin.services.CommandeServiceInt;

@RestController
@RequestMapping("commandes")
public class CommandeController {

	@Autowired
	private CommandeServiceInt service;
	
	@GetMapping()
	public List<Commande> getCommandes() {
		return this.service.get();
	}
	
	@GetMapping("client/{id}")
	public List<Commande> getCommandesByClient(@PathVariable Long id) {
		return this.service.getByClient(id);
	}
	
	@GetMapping("{id}")
	public Commande getCommandeById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Commande saveCommande(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
	
	@PatchMapping()
	public Commande update(@RequestBody Commande commande) {
		return this.service.update(commande);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}
