package com.example.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.magasin.models.Produit;
import com.example.magasin.repositories.ProduitRepository;

public class ProduitService implements GenericService<Produit> {

	@Autowired
	private ProduitRepository produitRepository;
	
	public List<Produit> get() {
		return this.produitRepository.findAll();
	}
	
	public Produit getById(Long id) {
		return this.produitRepository.getById(id);
	}
	
	public Produit save(Produit produit) {
		return this.produitRepository.save(produit);
	}
	
	public Produit update(Produit produit) {
		return this.produitRepository.save(produit);
	}
	
	public void deleteById(Long id) {
		this.produitRepository.deleteById(id);
	}
}
