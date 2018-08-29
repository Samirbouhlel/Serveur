package org.serveur.demo.service;

import java.util.List;

import org.serveur.demo.entity.Produit;

public interface IProduitService {
List<Produit>getProduits();
void addProduit(Produit produit);
void updateProduit(Produit produit);
void deleteProduit(String ref);
}
