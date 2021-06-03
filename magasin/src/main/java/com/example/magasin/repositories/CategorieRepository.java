package com.example.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasin.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
