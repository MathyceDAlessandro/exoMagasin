package com.example.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.magasin.models.Commande;
import com.example.magasin.repositories.CommandeRepository;

public class CommandeService implements CommandeServiceInt {

	@Autowired
	private CommandeRepository commandeRepository;
	
	public List<Commande> get() {
		return this.commandeRepository.findAll();
	}
	
	public List<Commande> getByClient(Long id) {
		return this.commandeRepository.findByClientId(id);
	}
	
	public Commande getById(Long id) {
		return this.commandeRepository.getById(id);
	}
	
	public Commande save(Commande commande) {
		return this.commandeRepository.save(commande);
	}
	
	public Commande update(Commande commande) {
		return this.commandeRepository.save(commande);
	}
	
	public void deleteById(Long id) {
		this.commandeRepository.deleteById(id);
	}
}
