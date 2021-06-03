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

import com.example.magasin.models.Client;
import com.example.magasin.services.GenericService;

@RestController
@RequestMapping("clients")
public class ClientController {

	@Autowired
	private GenericService<Client> service;
	
	@GetMapping()
	public List<Client> getClients() {
		return this.service.get();
	}
	
	@GetMapping("{id}")
	public Client getClientById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Client saveClient(@RequestBody Client client) {
		return this.service.save(client);
	}
	
	@PatchMapping()
	public Client update(@RequestBody Client client) {
		return this.service.update(client);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}
