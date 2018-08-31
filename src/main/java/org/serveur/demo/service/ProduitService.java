package org.serveur.demo.service;

import java.util.List;


import org.serveur.demo.entity.Produit;
import org.serveur.demo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProduitService implements IProduitService {

	@Autowired
	private ProduitRepository prooduitRepository;
	@Override
	public List<Produit> getProduits() {
		
		return prooduitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		prooduitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		prooduitRepository.save(produit);		
	}

	@Override
	public void deleteProduit(Long id ) {
		Produit produit = new Produit();
		produit.setId(id);
		prooduitRepository.delete(produit);
	}

}
