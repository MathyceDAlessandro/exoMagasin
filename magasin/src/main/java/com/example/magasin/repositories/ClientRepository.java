package com.example.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasin.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
