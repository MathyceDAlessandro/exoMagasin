package com.example.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.magasin.models.Categorie;
import com.example.magasin.repositories.CategorieRepository;

public class CategorieService implements GenericService<Categorie> {

	@Autowired
	private CategorieRepository categorieRepository;
	
	public List<Categorie> get() {
		return this.categorieRepository.findAll();
	}
	
	public Categorie getById(Long id) {
		return this.categorieRepository.getById(id);
	}
	
	public Categorie save(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}
	
	public Categorie update(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}
	
	public void deleteById(Long id) {
		this.categorieRepository.deleteById(id);
	}
}
