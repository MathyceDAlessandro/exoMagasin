package com.example.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.magasin.models.Produit;
import com.example.magasin.models.Categorie;
import com.example.magasin.models.Client;
import com.example.magasin.services.CommandeService;
import com.example.magasin.services.CommandeServiceInt;
import com.example.magasin.services.GenericService;
import com.example.magasin.services.ProduitService;
import com.example.magasin.services.CategorieService;
import com.example.magasin.services.ClientService;

@Configuration
public class ServiceConfig {

	@Bean
	public GenericService<Produit> ProduitServiceFactory() {
		return new ProduitService();
	}
	
	@Bean
	public GenericService<Client> ClientServiceFactory() {
		return new ClientService();
	}
	
	@Bean
	public GenericService<Categorie> CategorieServiceFactory() {
		return new CategorieService();
	}
	
	@Bean
	public CommandeServiceInt CommandeServiceFactory() {
		return new CommandeService();
	}
}
