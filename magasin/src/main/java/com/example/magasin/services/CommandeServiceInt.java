package com.example.magasin.services;

import java.util.List;

import com.example.magasin.models.Commande;

public interface CommandeServiceInt extends GenericService<Commande>{

	public List<Commande> getByClient(Long id);
	
}
