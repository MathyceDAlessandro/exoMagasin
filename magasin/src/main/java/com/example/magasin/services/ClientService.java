package com.example.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.magasin.models.Client;
import com.example.magasin.repositories.ClientRepository;

public class ClientService implements GenericService<Client> {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> get() {
		return this.clientRepository.findAll();
	}
	
	public Client getById(Long id) {
		return this.clientRepository.getById(id);
	}
	
	public Client save(Client client) {
		return this.clientRepository.save(client);
	}
	
	public Client update(Client client) {
		return this.clientRepository.save(client);
	}
	
	public void deleteById(Long id) {
		this.clientRepository.deleteById(id);
	}
}
