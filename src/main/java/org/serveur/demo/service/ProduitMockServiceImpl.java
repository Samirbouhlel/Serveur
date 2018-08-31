package org.serveur.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.serveur.demo.entity.Produit;
import org.springframework.stereotype.Service;
@Service

public class ProduitMockServiceImpl implements IProduitService {

	private List<Produit> produits;
	
	public ProduitMockServiceImpl() {
		produits=new ArrayList<Produit>();
		produits.add(new Produit("livre",50,20));
		produits.add(new Produit("cahier",200,5.25f));
		produits.add(new Produit("stylo",500,2.10f));
		
	}
	@Override
	public List<Produit> getProduits() {
		
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(Long id) {
	Produit produit=new Produit();
	produit.setId(id);
	produits.remove(produit);
		
	}

}
