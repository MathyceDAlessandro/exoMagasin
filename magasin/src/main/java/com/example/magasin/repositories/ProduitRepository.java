package com.example.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasin.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
