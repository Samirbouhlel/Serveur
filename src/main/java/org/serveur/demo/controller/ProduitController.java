package org.serveur.demo.controller;

import java.util.List;

import org.serveur.demo.entity.Produit;
import org.serveur.demo.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {
    @Autowired
	private IProduitService produitservice;
    
    @GetMapping
    public List<Produit>getProduits(){
    	return produitservice.getProduits();
    }
    @PostMapping
    public void addProduit( @RequestBody Produit produit) {
    	produitservice.addProduit(produit);
    }
    @PutMapping
    public void updateProduit(@RequestBody Produit produit) {
    	produitservice.updateProduit(produit);
    }
    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
    	produitservice.deleteProduit(id);
    }
}
